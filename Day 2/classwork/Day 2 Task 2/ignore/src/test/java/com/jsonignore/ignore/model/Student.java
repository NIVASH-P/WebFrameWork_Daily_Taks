package com.jsonignore.ignore.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    @JsonProperty("Student Creater")
    String name="Nithish";
    @JsonProperty("Age")
    int age=22;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
