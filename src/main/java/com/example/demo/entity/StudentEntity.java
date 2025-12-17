package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
// @Table(name="student")
public class StundentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private float cgpa;
    public void setID(String id){
        this.name=name;
    }
    public String getID(){
        return name;
    }
    public void setID(String id){
        this.name=name;
    }
    public String getID(){
        return name;
    }
    public void setID(String id){
        this.name=name;
    }
    public String getID(){
        return name;
    }


}