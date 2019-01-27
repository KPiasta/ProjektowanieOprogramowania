package com.wroccer.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Wniosek {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String druzyna;
    String data;
    String skladajacy;
    Status status;

    public List<Zawodnik> getZawodnik() {
        return zawodnik;
    }

    @OneToMany
    List<Zawodnik> zawodnik;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDruzyna() {
        return druzyna;
    }

    public void setDruzyna(String druzyna) {
        this.druzyna = druzyna;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSkladajacy() {
        return skladajacy;
    }

    public void setSkladajacy(String skldajacy) {
        this.skladajacy = skldajacy;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
