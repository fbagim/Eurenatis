package com.jetsetter.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

/**
 * Created by gim on 8/7/17.
 */
@Document(collection = "Room")
public class Room implements Serializable {

    @Indexed(unique = true)
    @JsonProperty("roomId")
    private String roomId;

    @JsonProperty("hotelId")
    private String hotelId;

    @JsonProperty("roomTypeId")
    private int roomTypeId;

    @JsonProperty("bookings")
    private List<BookingCalender> bookings;

    public List<BookingCalender> getBookings() {
        return bookings;
    }

    public void setBookings(List<BookingCalender> bookings) {
        this.bookings = bookings;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public int getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(int roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

}
