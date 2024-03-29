package com.courseexample.course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.courseexample.course.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,Integer>{
    List<Course> findByCourseName(String name);
}
