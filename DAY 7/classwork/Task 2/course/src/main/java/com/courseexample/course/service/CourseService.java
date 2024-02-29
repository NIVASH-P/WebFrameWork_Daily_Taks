package com.courseexample.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseexample.course.model.Course;
import com.courseexample.course.repository.CourseRepo;

@Service
public class CourseService {
    @Autowired
    public CourseRepo courseRepo;

    public Boolean AddData(Course course)
    {
        try{
            courseRepo.save(course);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public List<Course> getAll()
    {
        return courseRepo.findAll();
    }
    public List<Course> getAllbyName(String name)
    {
        return courseRepo.findByCourseName(name);
    }


}
