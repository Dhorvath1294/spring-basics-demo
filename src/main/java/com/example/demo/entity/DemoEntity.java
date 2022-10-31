package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// An entity represents a table in the database

@Entity
public class DemoEntity {

    @Id
    @GeneratedValue
    private int identity;
    private String name;

    // This default constructor is needed for the findAll repository method
    public DemoEntity() {
    }

    public DemoEntity(String name) {
        this.name = name;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
