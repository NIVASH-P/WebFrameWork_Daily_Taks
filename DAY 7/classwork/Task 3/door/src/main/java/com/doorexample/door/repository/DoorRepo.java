package com.doorexample.door.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doorexample.door.model.Door;

public interface DoorRepo extends JpaRepository<Door,Integer>{
    public List<Door> findByDoorId(int doorId);
    public List<Door> findByAccessType(String accesstype);
}
