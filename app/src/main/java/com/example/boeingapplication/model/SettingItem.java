package com.example.boeingapplication.model;

public class SettingItem {
    private int imageView;
    private String text;
    private  int imageView1;

    public SettingItem(int imageView, String text, int imageView1) {
        this.imageView = imageView;
        this.text = text;
        this.imageView1 = imageView1;
    }

    public int getImageView() {

        return imageView;
    }


    public String gettext() {

        return text;
    }


    public int getImageView1() {

        return imageView1;
    }

    public void setText(String text) {
        this.text = text;


    }
}

