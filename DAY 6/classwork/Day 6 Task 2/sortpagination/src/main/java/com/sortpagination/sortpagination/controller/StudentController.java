package com.sortpagination.sortpagination.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sortpagination.sortpagination.model.Student;
import com.sortpagination.sortpagination.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    public StudentService studentService;
    @PostMapping("/post")
    public ResponseEntity<Student> addData(@RequestBody Student student)
    {
        if(studentService.addData(student))
        {
            return new ResponseEntity<>(student, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(student, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/student/{off}/{size}")
    public ResponseEntity<List> Students(@PathVariable int off,@PathVariable int size){
        List<Student> list = studentService.getStudentsbyPage(off, size);
        if(list.isEmpty())
        {
            return new ResponseEntity<>(list, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/api/student/{off}/{size}/{name}")
    public ResponseEntity<List> gStudents(@PathVariable int off,@PathVariable int size,@PathVariable String name){
        List<Student> list = studentService.getStudentsbyPagebySort(off, size, name);
        if(!list.isEmpty())
        {
            return new ResponseEntity<>(list, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
        }
    }
}
