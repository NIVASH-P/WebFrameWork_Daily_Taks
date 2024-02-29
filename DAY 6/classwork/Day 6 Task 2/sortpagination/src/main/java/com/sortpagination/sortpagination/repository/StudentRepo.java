package com.sortpagination.sortpagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sortpagination.sortpagination.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{
    
}
