package com.doorexample.door.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doorexample.door.model.Door;
import com.doorexample.door.service.DoorService;

@RestController
public class DoorController {
    @Autowired
    public DoorService doorService;

    @PostMapping("/api/door")
    public Door insertData(@RequestBody Door door)
    {
        if(doorService.insertDoor(door))
        {
            return door;
        }
        else{
            return null;
        }
    }

    @GetMapping("/api/door")
    public List<Door> getAll()
    {
        return doorService.getAll();
    }
    @GetMapping("/api/door/doorId/{doorId}")
    public List<Door> getAll(@PathVariable int doorId)
    {
        return doorService.getDoorId(doorId);
    }
    @GetMapping("/api/door/accessType/{accessType}")
    public List<Door> getAll(@PathVariable String accessType)
    {
        return doorService.getByAccessType(accessType);
    }
}
