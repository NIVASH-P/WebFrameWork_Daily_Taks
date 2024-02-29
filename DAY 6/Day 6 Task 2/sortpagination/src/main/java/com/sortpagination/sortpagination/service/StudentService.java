package com.sortpagination.sortpagination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sortpagination.sortpagination.model.Student;
import com.sortpagination.sortpagination.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    public StudentRepo studentRepo;
    public boolean addData(Student student)
    {
        try{
            studentRepo.save(student);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public List<Student> getStudentsbyPage(int off,int size)
    {
        return studentRepo.findAll(PageRequest.of(off, size)).getContent();
    }
    
    public List<Student> getStudentsbyPagebySort(int off,int size,String name)
    {
        return studentRepo.findAll(PageRequest.of(off,size,Sort.by(Sort.Direction.DESC, name))).getContent();
    }

    
}
