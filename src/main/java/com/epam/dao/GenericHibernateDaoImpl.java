package com.epam.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import java.io.Serializable;
import java.util.List;

@Scope("prototype")
public class GenericHibernateDaoImpl<T extends Serializable> implements
        GenericHibernateDao<T> {

    protected Class<T> clazz;

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setClass(Class<T> classToSet) {
        this.clazz = classToSet;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T findById(int id) {
        T entity = (T) getCurrentSession().get(clazz, id);
        return entity;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> findAll() {
        List<T> list = (List<T>) getCurrentSession().createQuery("FROM " + clazz.getName()).list();
        return list;
    }

    @Override
    public void update(T entity) {
        getCurrentSession().saveOrUpdate(entity);
    }

    @Override
    public void save(T entity) {
        getCurrentSession().saveOrUpdate(entity);
    }

    @Override
    public void delete(T entity) {
        getCurrentSession().delete(entity);
    }

    protected final Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}
