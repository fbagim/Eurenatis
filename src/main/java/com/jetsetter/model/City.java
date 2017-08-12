package com.jetsetter.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;

/**
 * Created by gim on 8/9/17.
 */
@Document(collection = "City")
public class City {

    @Indexed(unique = true)
    @JsonProperty("zipcode")
    private int zipcode;

    @JsonProperty("countryIso")
    private String countryIso;

    @JsonProperty("cityName")
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

    public String getCountryIso() {
        return countryIso;
    }

    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }
}
