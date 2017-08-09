package com.jetsetter.model;

import java.util.List;
import java.util.Set;

/**
 * Created by gim on 8/9/17.
 */
public class City {
    private int zipcode;
    private String cityName;

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    private List<Hotel> hotels;


}
