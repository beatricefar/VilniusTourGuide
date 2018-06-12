package com.beatricefarias.vilniustourguide;

import android.os.Parcel;
import android.os.Parcelable;

public class Attraction implements Parcelable{

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

    protected Attraction(Parcel in) {
        imageId = in.readInt();
        attractionName = in.readString();
        location = in.readString();
        description = in.readString();
        isFree = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imageId);
        dest.writeString(attractionName);
        dest.writeString(location);
        dest.writeString(description);
        dest.writeByte((byte) (isFree ? 1 : 0));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Attraction> CREATOR = new Creator<Attraction>() {
        @Override
        public Attraction createFromParcel(Parcel in) {
            return new Attraction(in);
        }

        @Override
        public Attraction[] newArray(int size) {
            return new Attraction[size];
        }
    };

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
