package com.jpaexample.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpaexample.jpa.model.Person;
import com.jpaexample.jpa.service.PersonService;

@RestController
public class PersonController {
    @Autowired
    public PersonService personService;
    
    @PostMapping("/api/person")
    public ResponseEntity<Person> AddData(@RequestBody Person person)
    {
        if(personService.insertData(person))
        {
            return new ResponseEntity<>(person,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(person,HttpStatus.NOT_FOUND);

        }
    }
    @GetMapping("/api/person")
    public ResponseEntity<List<Person>> getAllPersons()
    {
        List<Person> list =  personService.getAll();
        if(!list.isEmpty())
        {
            return new ResponseEntity<>(list,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(list,HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/api/person/{age}")
    public ResponseEntity<List<Person>> getAllPersons(@PathVariable int age)
    {
        List<Person> list = personService.getByAge(age);
        if(!list.isEmpty())
        {
            return new ResponseEntity<>(list,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(list,HttpStatus.NOT_FOUND);
        }
    }

}
