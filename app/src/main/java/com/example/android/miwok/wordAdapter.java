package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class wordAdapter extends ArrayAdapter<word> {
    private int mcolorResourceId;
    public wordAdapter(Activity context, ArrayList<word> words,int colorResourceId) {
        super(context, 0, words);
        mcolorResourceId=colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        word currentword = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentword.getmiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentword.getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentword.hasimage()) {
            imageView.setImageResource(currentword.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mcolorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
