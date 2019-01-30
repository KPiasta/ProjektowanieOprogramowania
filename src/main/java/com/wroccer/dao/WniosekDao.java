package com.wroccer.dao;

import com.wroccer.entity.Wniosek;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class WniosekDao {

    @PersistenceContext
    EntityManager entityManager;

    public void update(Wniosek entity) {
        entityManager.merge(entity);
    }

}
