package com.jetsetter.util;

import com.jetsetter.model.AvailabilityRequestData;
import com.jetsetter.model.hotelbeds.HotelBedsAvailability;

public class AvailabilityRequestFactory {
    public static AvailabilityRequestData getRequest(String type, AvailabilityRequestData availabilityRequestData) {
        if (type=="" && availabilityRequestData!=null) {
            HotelBedsAvailability hotelBedsAvailability = new HotelBedsAvailability();
            return hotelBedsAvailability;
        }
        return null;
    }
}
