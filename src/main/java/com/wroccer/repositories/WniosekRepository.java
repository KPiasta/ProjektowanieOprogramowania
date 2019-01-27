package com.wroccer.repositories;

import com.wroccer.entity.Wniosek;
import com.wroccer.entity.Zawodnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface WniosekRepository extends JpaRepository<Wniosek, Long> {
    Wniosek findById(Long id);
    List<Wniosek> findAll();

}
