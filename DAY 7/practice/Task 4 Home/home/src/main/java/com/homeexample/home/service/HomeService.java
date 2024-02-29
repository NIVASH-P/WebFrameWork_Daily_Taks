package com.homeexample.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.homeexample.home.Repository.HomeRepo;
import com.homeexample.home.model.Home;

@Service
public class HomeService {
    @Autowired
    public HomeRepo homeRepo;

    public boolean addData(Home home)
    {
        try{
            homeRepo.save(home);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public List<Home> getAll()
    {
        return homeRepo.findAll();
    }

    public List<Home> getDistinct()
    {
        return homeRepo.findDistinctByCurentOwnerNameAndAddress();
    }
}
