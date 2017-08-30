package com.jetsetter.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class RoomAvailability implements Serializable {

    @JsonProperty("roomType")
    private int roomType;
    @JsonProperty("noOfRooms")
    private int noOfRooms;
    @JsonProperty("noOfAvilableRooms")
    private int noOfAvilableRooms;
    @JsonProperty("isAvilable")
    private boolean isAvilable;

    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public int getNoOfAvilableRooms() {
        return noOfAvilableRooms;
    }

    public void setNoOfAvilableRooms(int noOfAvilableRooms) {
        this.noOfAvilableRooms = noOfAvilableRooms;
    }

    public boolean isAvilable() {
        return isAvilable;
    }

    public void setAvilable(boolean avilable) {
        isAvilable = avilable;
    }
}
