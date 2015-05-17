package com.epam.service;

import com.epam.entity.User;

import java.util.List;

/**
 * Created by Вадим on 02.05.2015.
 */
public interface GenericManager<T> {

    T findById(int id);

    List<T> findAll();

    void save(T entity);

    void update(T entity);

    void delete(T entity);

}
