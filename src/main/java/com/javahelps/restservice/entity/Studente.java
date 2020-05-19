package com.javahelps.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "student")
public class Studente
{
    @Id
    private Integer id;
    private String name;
    private String surname;
    private String sidi;
    private String tax;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSidi() {
        return sidi;
    }

    public void setSidi(String sidi) {
        this.sidi = sidi;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Studente{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", surname=" + surname + '\'' + ", sidi=" + sidi + '\''+ ", tax=" + tax + '\''+'}';
    }
    
    
}