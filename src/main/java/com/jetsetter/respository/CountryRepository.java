package com.jetsetter.respository;

import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.awt.geom.Ellipse2D;
import java.io.Serializable;

/**
 * Created by gim on 8/9/17.
 */
public class CountryRepository implements ElasticsearchRepository {

    @Override
    public Object index(Object o) {
        return null;
    }

    @Override
    public Iterable search(QueryBuilder queryBuilder) {
        return null;
    }

    @Override
    public Page search(QueryBuilder queryBuilder, Pageable pageable) {
        return null;
    }

    @Override
    public Page search(SearchQuery searchQuery) {
        return null;
    }

    @Override
    public Page searchSimilar(Object o, String[] strings, Pageable pageable) {
        return null;
    }

    @Override
    public void refresh() {

    }

    @Override
    public Class getEntityClass() {
        return null;
    }

    @Override
    public Iterable findAll(Sort sort) {
        return null;
    }

    @Override
    public Page findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Object save(Object o) {
        return null;
    }

    @Override
    public Iterable save(Iterable iterable) {
        return null;
    }

    @Override
    public Object findOne(Serializable serializable) {
        return null;
    }

    @Override
    public boolean exists(Serializable serializable) {
        return false;
    }

    @Override
    public Iterable findAll() {
        return null;
    }

    @Override
    public Iterable findAll(Iterable iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Serializable serializable) {

    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public void delete(Iterable iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
