package com.wroccer.dao;


import com.wroccer.entity.Druzyna;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class DruzynaDao {

    @PersistenceContext
    EntityManager entityManager;

    public Druzyna addWniosek(Druzyna entity) {
        entityManager.persist(entity);
        return entity;
    }

    public void update(Druzyna entity) {
        entityManager.merge(entity);
    }

}
