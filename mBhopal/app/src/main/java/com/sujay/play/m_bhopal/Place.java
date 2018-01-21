package com.sujay.play.m_bhopal;

/**
 * Created by Sujay-PC on 04-01-2018.
 */

public class Place {
    private String name;
    private String location;
    private int imageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public Place(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Place(String name, String location, int imageResourceId) {
        this.name = name;
        this.location = location;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        //if imageResourceId is not equal to -1 that means it has image & returns true else return false
        return imageResourceId != NO_IMAGE;
    }
}
