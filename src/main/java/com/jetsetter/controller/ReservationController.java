package com.jetsetter.controller;

import com.jetsetter.model.AvailabilityData;
import com.jetsetter.model.City;
import com.jetsetter.model.Room;
import com.jetsetter.service.CityService;
import com.jetsetter.service.ReservationService;
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

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity checkAvilability(@RequestBody AvailabilityData availabilityData) {
        List<Room> roomList = reservationService.checkHotelAvailability(availabilityData);
        if (roomList.isEmpty()) {
            return new ResponseEntity<List<Room>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Room>>(roomList, HttpStatus.OK);
    }
}
