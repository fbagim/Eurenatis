package com.jetsetter.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.jetsetter.model.AvailabilityData;
import com.jetsetter.model.AvailabilityRequestData;
import com.jetsetter.model.City;
import com.jetsetter.model.Room;
import com.jetsetter.model.hotelbeds.HotelBedsAvailability;

import java.util.List;

/**
 * Created by gim on 8/9/17.
 */

public interface ReservationService {
    public String checkHotelAvailability(HotelBedsAvailability availabilityData, String requestType) throws JsonProcessingException;

}
