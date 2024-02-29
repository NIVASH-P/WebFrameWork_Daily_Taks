package com.homeexample.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeexample.home.model.Home;
import com.homeexample.home.service.HomeService;

@RestController
public class HomeController {
    @Autowired
    public HomeService homeService;

    @PostMapping("/api/car")
    public Home AddHome(@RequestBody Home home)
    {
        if(homeService.addData(home))
        {
            return home;
        }
        else{
            return null;
        }
    }

    @GetMapping("/api/car")
    public List<Home> getAll()
    {
        return homeService.getAll();
    }
    @GetMapping("/api/car/distinct")
    public List<Home> getAllDistinct()
    {
        return homeService.getDistinct();
    }
}
