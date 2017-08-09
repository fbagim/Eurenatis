package com.jetsetter.service;

import com.jetsetter.model.Country;

import java.util.List;

/**
 * Created by gim on 8/9/17.
 */
public interface CountryService {
    public Country save(Country book);

    public void delete(Country book);

    public Country findOne(String id);

    public List<Country>  findAll();

    public List<Country> findByCode(String code);

}
