package com.jpaexample.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpaexample.jpa.model.Person;
import com.jpaexample.jpa.repository.PersonRepo;

@Service
public class PersonService {
    @Autowired
    public PersonRepo personRepo;

    public boolean insertData(Person person)
    {
        try{
            personRepo.save(person);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public List<Person> getAll()
    {
        return personRepo.findAll();
    }
    public List<Person> getByAge(int age)
    {
        return personRepo.findByAge(age);
    }
}
