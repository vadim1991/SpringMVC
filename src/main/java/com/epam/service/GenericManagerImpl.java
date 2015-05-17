package com.epam.service;

import com.epam.dao.GenericHibernateDao;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@EnableTransactionManagement
public class GenericManagerImpl<T, D extends GenericHibernateDao<T>> implements
        GenericManager<T> {

    protected D dao;

    public void setDao(GenericHibernateDao dao) {
        this.dao = (D) dao;
    }

    @Transactional
    @Override
    public T findById(int id) {
        return dao.findById(id);
    }

    @Transactional
    @Override
    public List<T> findAll() {
        return dao.findAll();
    }

    @Transactional(rollbackFor = {Exception.class})
    @Override
    public void save(T entity) {
        dao.save(entity);
    }

    @Transactional
    @Override
    public void update(T entity) {
        dao.update(entity);
    }

    @Transactional
    @Override
    public void delete(T entity) {
        dao.delete(entity);
    }

}
