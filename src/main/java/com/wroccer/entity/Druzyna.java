package com.wroccer.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Druzyna {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nazwa;
    Integer sezon;

    @OneToMany(fetch = FetchType.EAGER)
    List<Zawodnik> zawodnik;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public List<Zawodnik> getZawodnik() {
        return zawodnik;
    }

    public void setZawodnik(List<Zawodnik> zawodnik) {
        this.zawodnik = zawodnik;
    }

    public Integer getSezon() {
        return sezon;
    }

    public void setSezon(Integer sezon) {
        this.sezon = sezon;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
