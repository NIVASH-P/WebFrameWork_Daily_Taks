package com.homeexample.home.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeexample.home.model.Home;

public interface HomeRepo extends JpaRepository<Home,Integer>{
    public List<Home> findDistinctByCurentOwnerNameAndAddress();
}
