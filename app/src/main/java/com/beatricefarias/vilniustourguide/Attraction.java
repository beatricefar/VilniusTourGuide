package com.beatricefarias.vilniustourguide;

public class Attraction {

    private int imageId;
    private String attractionName;
    private String location;
    private String description;
    private boolean isFree;

    public Attraction(String attractionName, int imageId, String location, String description, boolean isFree) {
        this.imageId = imageId;
        this.attractionName = attractionName;
        this.location = location;
        this.description = description;
        this.isFree = isFree;
    }

    public int getImageId() {
        return imageId;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public boolean getPrice() { return isFree; }

}
