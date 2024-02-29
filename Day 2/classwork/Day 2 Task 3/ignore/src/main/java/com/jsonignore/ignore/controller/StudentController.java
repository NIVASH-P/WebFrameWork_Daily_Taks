package com.jsonignore.ignore.controller;
  
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsonignore.ignore.model.Student;
@RestController
public class StudentController {
    Student s = new Student();

    @PostMapping("/post")
    public Student getStudent(@RequestBody Student st)
    {
        s.id=st.id;
        s.Name=st.Name;
        s.description=st.description;
        return s;
    }
}
