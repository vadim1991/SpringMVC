package com.epam.dao;

import java.util.List;

/**
 * Created by Вадим on 02.05.2015.
 */

public interface GenericHibernateDao<T> {

    T findById(int id);

    List<T> findAll();

    void update(T entity);

    void save(T entity);

    void delete(T entity);

}
