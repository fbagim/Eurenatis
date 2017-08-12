package com.jetsetter.respository;


import com.jetsetter.model.Country;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import java.awt.geom.Ellipse2D;
import java.io.Serializable;
import java.util.List;

/**
 * Created by gim on 8/9/17.
 */
@RepositoryRestResource(collectionResourceRel = "Country", path = "Country")
public interface CountryRepository extends MongoRepository<Country, String>  {

}
