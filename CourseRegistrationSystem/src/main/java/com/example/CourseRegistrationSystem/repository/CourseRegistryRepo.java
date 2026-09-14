package com.example.CourseRegistrationSystem.repository;

import com.example.CourseRegistrationSystem.module.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {

}
