package com.example.demo.entity;

import jakarta.persistence.Entity;


@Entity
public class StundentEntity{
    private Long id;
    private String name;
    private String email;
    private float cgpa;
    
}