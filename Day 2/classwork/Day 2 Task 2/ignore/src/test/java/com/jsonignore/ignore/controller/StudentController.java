package com.jsonignore.ignore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsonignore.ignore.model.Student;

@RestController
public class StudentController {
    @Autowired
    Student s;
    @RequestMapping("/path")
    public Student getStudent()
    {
        return s;
    }
}

