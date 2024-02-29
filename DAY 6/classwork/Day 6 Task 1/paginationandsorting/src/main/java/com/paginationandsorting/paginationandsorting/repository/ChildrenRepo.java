package com.paginationandsorting.paginationandsorting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paginationandsorting.paginationandsorting.model.Children;


@Repository
public interface ChildrenRepo extends JpaRepository<Children ,Integer>{

     
}
