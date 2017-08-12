package com.jetsetter.service;

import com.jetsetter.model.City;
import com.jetsetter.model.Room;
import com.jetsetter.respository.CityRepository;
import com.jetsetter.respository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gim on 8/9/17.
 */

@Service
public class RoomServiceImpl implements RoomService{

    @Autowired(required = true)
    private RoomRepository roomRepository;


    @Override
    public Room save(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public void delete(String id) {
        roomRepository.delete(id);
    }

    @Override
    public Room findOne(String id) {
        return roomRepository.findOne(id);
    }

    @Override
    public Room findByRoomId(String roomId) {
        return roomRepository.findByRoomId(roomId);
    }

    @Override
    public List<Room> findByHotelCode(String hotelCode) {
        return roomRepository.findByHotelCode(hotelCode);
    }
}
