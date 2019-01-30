package com.wroccer.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Zawodnik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String imie;
    String nazwisko;
    String data_urodzenia;
    String pozycja;


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }


    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData_urodzenia() {
        return data_urodzenia;
    }

    public void setData_urodzenia(String data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }

    public String getPozycja() {
        return pozycja;
    }

    public void setPozycja(String pozycja) {
        this.pozycja = pozycja;
    }

}

