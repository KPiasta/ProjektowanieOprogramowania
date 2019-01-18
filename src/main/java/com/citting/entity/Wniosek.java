package com.citting.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wniosek {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String druzyna;
    String data;
    String skldajacy;
    Status status;

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

    public String getSkldajacy() {
        return skldajacy;
    }

    public void setSkldajacy(String skldajacy) {
        this.skldajacy = skldajacy;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
