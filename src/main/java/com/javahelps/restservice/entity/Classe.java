/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package com.javahelps.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author giuli
 */
@Entity
public class Classe 
{
    @Id
    private int Id;
    private int year;
    private String section;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Classe{" + "id='" + Id + '\'' + ", section='" + section + '\'' + ", year='" + year + '\'' + '}';
    }
    
}