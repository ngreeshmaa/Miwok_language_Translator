package com.example.android.miwok;

public class word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudio;

    public word(String defaultTranslation, String miwokTranslation, int Audio) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudio = Audio;
    }

    public word(String defaultTranslation, String miwokTranslation, int ImageResourceId, int Audio) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudio = Audio;
    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmiwokTranslation() {

        return mMiwokTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getmAudio() {
        return mAudio;
    }

    public boolean hasimage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
