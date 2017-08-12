package com.jetsetter.respository;


import com.jetsetter.model.City;
import com.jetsetter.model.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**ity
 * Created by gim on 8/9/17.
 */
@RepositoryRestResource(collectionResourceRel = "Hotel", path = "Hotel")
public interface HotelRepository extends MongoRepository<Hotel, String>  {

    @Query("{ 'hotelCode' : ?0 ,  'countryCode' : ?0 }")
    public List<Hotel> findByHotelCodeAndCountryCode(String hotelCode, String countryCode);


    @Query("{'countryCode' : ?0 }")
    public List<Hotel> findByCountryCode(String countryCode);

}
