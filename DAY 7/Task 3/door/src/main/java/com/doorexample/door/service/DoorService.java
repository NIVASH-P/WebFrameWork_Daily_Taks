package com.doorexample.door.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.doorexample.door.model.Door;
import com.doorexample.door.repository.DoorRepo;

@Service
public class DoorService {
    @Autowired
    public DoorRepo doorRepo;

    public Boolean insertDoor(Door door)
    {
        try{
            doorRepo.save(door);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public List<Door> getAll()
    {
        return doorRepo.findAll();
    }
    public List<Door>getDoorId(int doorId)
    {
        return doorRepo.findByDoorId(doorId);
    }
    public List<Door>getByAccessType(String accessType)
    {
        return doorRepo.findByAccessType(accessType);
    }

}
