package com.courseexample.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.courseexample.course.model.Course;
import com.courseexample.course.service.CourseService;

@RestController
public class CourseController {
    @Autowired
    public CourseService courseService;

    @GetMapping("/api/course")
    public List<Course> getAllCourses()
    {
        return courseService.getAll();
    }
    @GetMapping("/api/course/{name}")
    public List<Course> getAllCourses(@PathVariable String name)
    {
        return courseService.getAllbyName(name);
    }
    @PostMapping("/api/course")
    public ResponseEntity<Course> insertData(@RequestBody Course course)
    {
        if(courseService.AddData(course))
        {
            return new ResponseEntity<>(course,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
