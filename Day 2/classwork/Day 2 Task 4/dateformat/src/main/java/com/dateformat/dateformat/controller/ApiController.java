package com.dateformat.dateformat.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dateformat.dateformat.model.dateformat;

@RestController
public class ApiController {
    @RequestMapping("/path")
    public dateformat getdateformat()  throws ParseException
    {
        String dt="1986-12-12";
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        Date dat = sd.parse(dt);
        dateformat d = new dateformat("erehty", "gfrgre5h", dat);
        return d;

    }
}
