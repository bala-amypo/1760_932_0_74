package com.example.demo.entity;

import jakarta.persistence.Entity;


@Entity
// @Table(name="student")
public class StundentEntity{
    @Id
    private Long id;
    private String name;
    private String email;
    private float cgpa;

}