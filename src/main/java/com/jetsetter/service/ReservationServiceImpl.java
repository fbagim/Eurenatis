package com.jetsetter.service;

import com.jetsetter.model.*;
import com.jetsetter.respository.CityRepository;
import com.jetsetter.respository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gim on 8/9/17.
 */

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired(required = true)
    private HotelRepository hotelRepository;


    @Override
    public List<Room> checkHotelAvailability(AvailabilityData availabilityData) {
        Hotel hotel = hotelRepository.findOne(availabilityData.getHotelCode());
        List<Room> avilabeRooms = new ArrayList<>();
        if (hotel != null) {
            List<Room> roomList = hotel.getRooms();
            for (Room room : roomList) {
                List<BookingCalender> bookingCalenders = room.getBookings();
                for (BookingCalender bookingCalender : bookingCalenders) {
                    if (bookingCalender.getFromDate().getTime() != availabilityData.getFromDate().getTime() && bookingCalender.getToDate().getTime() != availabilityData.getToDate().getTime()) {
                        if ((bookingCalender.getToDate().getTime() - bookingCalender.getFromDate().getTime()) != (availabilityData.getToDate().getTime() - availabilityData.getFromDate().getTime())) {
                            avilabeRooms.add(room);
                        }
                    }
                }
            }
            return avilabeRooms;
        }
        return null;
    }

    @Override
    public List<Room>  bookHotel(AvailabilityData availabilityData) {
        return null;
    }
}
