package com.jetsetter.model.hotelbeds;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Filter implements Serializable {
    @JsonProperty("maxHotels")
    private int maxHotels;
    @JsonProperty("maxRooms")
    private int maxRooms;
    @JsonProperty("maxRatesPerRoom")
    private int maxRatesPerRoom;
    @JsonProperty("minCategory")
    private int minCategory;
    @JsonProperty("maxCategory")
    private int maxCategory;
    @JsonProperty("paymentType")
    private String paymentType;
    @JsonProperty("maxRate")
    private String maxRate;

    public int getMaxHotels() {
        return maxHotels;
    }

    public void setMaxHotels(int maxHotels) {
        this.maxHotels = maxHotels;
    }

    public int getMaxRooms() {
        return maxRooms;
    }

    public void setMaxRooms(int maxRooms) {
        this.maxRooms = maxRooms;
    }

    public int getMaxRatesPerRoom() {
        return maxRatesPerRoom;
    }

    public void setMaxRatesPerRoom(int maxRatesPerRoom) {
        this.maxRatesPerRoom = maxRatesPerRoom;
    }

    public int getMinCategory() {
        return minCategory;
    }

    public void setMinCategory(int minCategory) {
        this.minCategory = minCategory;
    }

    public int getMaxCategory() {
        return maxCategory;
    }

    public void setMaxCategory(int maxCategory) {
        this.maxCategory = maxCategory;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getMaxRate() {
        return maxRate;
    }

    public void setMaxRate(String maxRate) {
        this.maxRate = maxRate;
    }
}
