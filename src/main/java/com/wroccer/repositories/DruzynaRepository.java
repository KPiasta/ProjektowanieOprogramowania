package com.wroccer.repositories;

import com.wroccer.entity.Druzyna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface DruzynaRepository extends JpaRepository<Druzyna, Long> {
    Druzyna findById(Long id);
    List<Druzyna> findAll();


}
