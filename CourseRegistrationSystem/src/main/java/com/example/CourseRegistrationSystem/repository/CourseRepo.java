package com.example.CourseRegistrationSystem.repository;

import com.example.CourseRegistrationSystem.module.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,String> {

}
