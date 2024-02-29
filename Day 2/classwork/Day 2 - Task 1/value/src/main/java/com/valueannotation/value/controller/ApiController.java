package com.valueannotation.value.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valueannotation.value.config.AppConfig;

@RestController
public class ApiController {
    @Autowired
    AppConfig ap;

    @RequestMapping("/map")
    public String getAppName()
    {
        return ap.getAppName()+ap.getAppVersion();
    }
}
