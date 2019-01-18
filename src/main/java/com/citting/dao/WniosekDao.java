package com.citting.dao;

import com.citting.entity.Wniosek;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class WniosekDao {

    @PersistenceContext
    EntityManager entityManager;

    public Wniosek addWniosek(Wniosek entity) {
        entityManager.persist(entity);
        return entity;
    }

    public void update(Wniosek entity) {
        entityManager.merge(entity);
    }

    public List<Wniosek> getList() {
        Query query = entityManager.createQuery("SELECT b FROM Wniosek b");
        List<Wniosek> wnioski = query.getResultList();
        return wnioski;

    }
}
