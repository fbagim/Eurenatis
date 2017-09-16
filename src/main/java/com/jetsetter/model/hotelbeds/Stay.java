package com.jetsetter.model.hotelbeds;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Stay implements Serializable{
    @JsonProperty("checkIn")
    private String checkIn;
    @JsonProperty("checkOut")
    private String checkOut;
    @JsonProperty("shiftDays")
    private int shiftDays;

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public int getShiftDays() {
        return shiftDays;
    }

    public void setShiftDays(int shiftDays) {
        this.shiftDays = shiftDays;
    }
}
