package com.example.CourseRegistrationSystem.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CourseRegistry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//no need to provide value
    private int id;

    private String Name;
    private String Email_Id;
    private String CourseName;

    public String getCourseName() {
        return CourseName;
    }
    public void setCourseName(String courseName) {
        CourseName = courseName;
    }
    public String getEmailId() {
        return Email_Id;
    }
    public void setEmailId(String emailId) {
        Email_Id = emailId;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public CourseRegistry( String courseName, String email_Id, String name) {
        CourseName = courseName;
        Email_Id = email_Id;
        Name = name;
    }

    public CourseRegistry() {
    }
}
