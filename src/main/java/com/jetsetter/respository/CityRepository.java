package com.jetsetter.respository;


import com.jetsetter.model.City;
import com.jetsetter.model.Country;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**ity
 * Created by gim on 8/9/17.
 */
@RepositoryRestResource(collectionResourceRel = "City", path = "City")
public interface CityRepository extends MongoRepository<City, String>  {

}
