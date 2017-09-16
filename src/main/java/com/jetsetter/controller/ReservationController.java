package com.jetsetter.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.jetsetter.model.*;
import com.jetsetter.model.hotelbeds.HotelBedsAvailability;
import com.jetsetter.service.ReservationService;
import com.jetsetter.util.AvailabilityRequestFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by gim on 8/9/17.
 */

@RestController
@RequestMapping("/jetsetter/api/reservation")
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    @RequestMapping(value = "/checkAvailability", method = RequestMethod.POST)
    public ResponseEntity checkAvilability(@RequestBody HotelBedsAvailability hotelBedsAvailability, @RequestParam String requestType) throws JsonProcessingException {
        AvailabilityRequestFactory.getRequest(requestType, hotelBedsAvailability);
        String resp = reservationService.checkHotelAvailability(hotelBedsAvailability, requestType);
        if (resp.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(resp, HttpStatus.OK);
    }
}
