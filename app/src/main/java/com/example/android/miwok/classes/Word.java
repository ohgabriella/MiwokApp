package com.example.android.miwok.classes;

public class Word {

    private String miwokTranslation;
    private String defaultTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDES;

    public static final int NO_IMAGE_PROVIDES = -1;

    public Word(String miwokTranslation, String defaultTranslation) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageResourceId = imageResourceId;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDES;
    }
}