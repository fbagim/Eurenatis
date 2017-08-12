package com.jetsetter.respository;


import com.jetsetter.model.Hotel;
import com.jetsetter.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**ity
 * Created by gim on 8/9/17.
 */
@RepositoryRestResource(collectionResourceRel = "Room", path = "Room")
public interface RoomRepository extends MongoRepository<Room, String>  {

    @Query("{'roomId' : ?0 }")
    public Room findByRoomId(String roomId);

    @Query("{'hotelCode' : ?0 }")
    public List<Room> findByHotelCode(String hotelCode);

}
