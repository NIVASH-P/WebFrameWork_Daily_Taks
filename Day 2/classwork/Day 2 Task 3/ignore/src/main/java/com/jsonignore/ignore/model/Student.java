package com.jsonignore.ignore.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
public class Student {
    public long id;
    public String Name;
    @JsonIgnore
    public String description;
    
    public Student() {
    }
    public Student(long id, String name, String description) {
        this.id = id;
        Name = name;
        this.description = description;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
}
