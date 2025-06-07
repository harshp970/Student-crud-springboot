package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String course;
    private Integer rollNumber;

    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    // Other getters and setters
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

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }
}