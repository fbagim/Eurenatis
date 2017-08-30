package com.jetsetter.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class AvailabilityData implements Serializable{
    @JsonProperty("hotelCode")
    private String hotelCode;
    @JsonProperty("roomAvailabilities")
    private List<RoomAvailability> roomAvailabilities;
    @JsonProperty("fromDate")
    private Date fromDate;
    @JsonProperty("toDate")
    private Date toDate;

    public String getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(String hotelCode) {
        this.hotelCode = hotelCode;
    }

    public List<RoomAvailability> getRoomAvailabilities() {
        return roomAvailabilities;
    }

    public void setRoomAvailabilities(List<RoomAvailability> roomAvailabilities) {
        this.roomAvailabilities = roomAvailabilities;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
