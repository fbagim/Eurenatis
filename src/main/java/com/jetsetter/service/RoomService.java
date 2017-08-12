package com.jetsetter.service;

import com.jetsetter.model.Hotel;
import com.jetsetter.model.Room;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by gim on 8/9/17.
 */

public interface RoomService {

    public Room save(Room room);

    public void delete(String id);

    public Room findOne(String id);

    public Room findByRoomId(String roomId);

    public List<Room> findByHotelCode(String hotelCode);

}
