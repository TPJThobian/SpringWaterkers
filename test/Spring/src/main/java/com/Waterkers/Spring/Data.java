package com.Waterkers.Spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Data {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer GrondTemp;

    private Integer GrondVocht;

    private Integer PHWaarde;

    private Integer LuchtTemp;

    private Integer LuchtVocht;

    private String Datum&Tijd;

    public Integer getGrondTemp() {
        return GrondTemp;
    }

    public void setGrondTemp(Integer GrondTemp) {
        this.GrondTemp = GrondTemp;
    }

    public Integer getGrondVocht() {
        return GrondVocht;
    }

    public void setGrondVocht(Integer GrondVocht) {
        this.GrondVocht = GrondVocht;
    }

    public Integer getPHWaarde() {
        return PHWaarde;
    }

    public void setPHWaarde(Integer PHWaarde) {
        this.PHWaarde = PHWaarde;
    }

    public Integer getLuchtTemp() {
        return LuchtTemp;
    }

    public void setLuchtTemp(Integer LuchtTemp) {
        this.LuchtTemp = LuchtTemp;
    }

    public Integer getLuchtVocht() {
        return LuchtVocht;
    }

    public void setLuchtVocht(Integer LuchtVocht) {
        this.LuchtVocht = LuchtVocht;
    }

    public String getDatum&Tijd() {
        return Datum&Tijd;
    }

    public void setDatum&Tijd(String Datum&Tijd) {
        this.Datum&Tijd = Datum&Tijd;
    }

    private Integer id;

    private String name;

    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
