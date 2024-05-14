package com.example.boeingapplication.model;
//suresh ramesh ganesh
public class BinItem {
    private final int imageResourceId;
    private final String text;


    public BinItem(int imageResourceId, String text) {
        this.imageResourceId = imageResourceId;
        this.text = text;
    }


    public int getImageResourceId() {

        return imageResourceId;
    }

    public String getText() {
        return text;
    }
}
