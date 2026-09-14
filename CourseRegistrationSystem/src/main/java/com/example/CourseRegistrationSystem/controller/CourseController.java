package com.example.CourseRegistrationSystem.controller;

import com.example.CourseRegistrationSystem.module.Course;
import com.example.CourseRegistrationSystem.module.CourseRegistry;
import com.example.CourseRegistrationSystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseservice;
    @GetMapping("course")
    public List<Course> availableCourse(){
        return courseservice.availaleCourse();
    }

    @GetMapping("course/entrolled")
    public List<CourseRegistry> entrolledStudents(){
    return courseservice.entrolledStudents();
    }

    @PostMapping("course/register")
    public String entrollCourse(@RequestParam("CourseName") String CourseName,
                                @RequestParam("Email_Id") String Email_Id,
                                @RequestParam("Name") String Name)
                                {
        courseservice.entrollCourse(CourseName,Email_Id,Name);
        return "Congratulations!" + Name + "Entrollement succesful for" + CourseName;
    }
}
