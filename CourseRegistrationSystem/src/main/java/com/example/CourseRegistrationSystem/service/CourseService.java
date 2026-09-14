package com.example.CourseRegistrationSystem.service;

import com.example.CourseRegistrationSystem.module.Course;
import com.example.CourseRegistrationSystem.module.CourseRegistry;
import com.example.CourseRegistrationSystem.repository.CourseRegistryRepo;
import com.example.CourseRegistrationSystem.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistryRepo courseregistryrepo;

    public List<Course> availaleCourse() {
        return courseRepo.findAll();
    }

    public List<CourseRegistry> entrolledStudents() {
        return courseregistryrepo.findAll();
    }

    public void entrollCourse(String courseName, String emailId, String name) {
        CourseRegistry courseRegistry = new CourseRegistry(courseName, emailId,name);
        courseregistryrepo.save(courseRegistry);
    }
}