package com.jetsetter.controller;

import com.jetsetter.model.City;
import com.jetsetter.model.Room;
import com.jetsetter.service.CityService;
import com.jetsetter.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by gim on 8/9/17.
 */

@RestController
@RequestMapping("/jetsetter/api/room")
public class RoomController {
    @Autowired
    RoomService roomService;

    // -------------------Retrieve all students --------------------------------------------



    @RequestMapping(value = "/{roomId}", method = RequestMethod.GET)
    public ResponseEntity getRoom(@PathVariable String roomId) {
        Room room = roomService.findOne(roomId);
        if (room == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(room, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity addRoom(@RequestBody Room room) {
        Room roomRes = roomService.save(room);
        if (roomRes == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Room>(roomRes, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity updateCity(String hotelCode) {
        List<Room> rooms = roomService.findByHotelCode(hotelCode);
        if (rooms.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Room>>(rooms, HttpStatus.OK);
    }

    @RequestMapping(value = "/{roomId}", method = RequestMethod.DELETE)
    public ResponseEntity deleteRoom(@PathVariable String roomId) {
        roomService.delete(roomId);
        return new ResponseEntity(roomId, HttpStatus.OK);
    }
}
