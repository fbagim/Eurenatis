package com.jetsetter.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by gim on 8/10/17.
 */

public class BookingCalender implements Serializable {

    @JsonProperty("calenderId")
    private String calenderId;
    @JsonProperty("fromDate")
    private Calendar fromDate;
    @JsonProperty("toDate")
    private Calendar toDate;
    @JsonProperty("noOFDays")
    private int noOFDays;
    @JsonProperty("isBooked")
    private boolean isBooked;


    public String getCalenderId() {
        return calenderId;
    }

    public void setCalenderId(String calenderId) {
        this.calenderId = calenderId;
    }

    public Calendar getFromDate() {
        return fromDate;
    }

    public void setFromDate(Calendar fromDate) {
        this.fromDate = fromDate;
    }

    public Calendar getToDate() {
        return toDate;
    }

    public void setToDate(Calendar toDate) {
        this.toDate = toDate;
    }

    public int getNoOFDays() {
        return noOFDays;
    }

    public void setNoOFDays(int noOFDays) {
        this.noOFDays = noOFDays;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
