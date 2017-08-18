package com.jetsetter.service;

import com.jetsetter.model.AvailabilityData;
import com.jetsetter.model.City;
import com.jetsetter.model.Room;

import java.util.List;

/**
 * Created by gim on 8/9/17.
 */

public interface ReservationService {
    public List<Room>  checkHotelAvailability(AvailabilityData availabilityData);
    public List<Room>  bookHotel(AvailabilityData availabilityData);

}
