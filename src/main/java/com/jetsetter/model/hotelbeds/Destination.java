package com.jetsetter.model.hotelbeds;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Destination implements Serializable {
    @JsonProperty("code")
    private  String code;
    @JsonProperty("zone")
    private  String zone;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
