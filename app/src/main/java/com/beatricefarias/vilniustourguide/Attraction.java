package com.beatricefarias.vilniustourguide;

public class Attraction {

    private int imageId;
    private String attractionName;
    private String location;
    private String description;
    private int price;

    public Attraction(String attractionName, int imageId, String location, String description, int price) {
        this.imageId = imageId;
        this.attractionName = attractionName;
        this.location = location;
        this.description = description;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

}
