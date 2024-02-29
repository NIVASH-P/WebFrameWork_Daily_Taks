package com.paginationandsorting.paginationandsorting.service;

import java.util.List;

import org.hibernate.query.SortDirection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.paginationandsorting.paginationandsorting.model.Children;
import com.paginationandsorting.paginationandsorting.repository.ChildrenRepo;

@Service
public class ChildrenService {
    @Autowired
    public ChildrenRepo childrenRepo;
    public Boolean postChildren(Children children)
    {
        try{
            childrenRepo.save(children);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public List<Children> getAllList()
    {
        return childrenRepo.findAll();
    }
    public List<Children> ProductPaginationbySort(int offset,int page,String col)
    {
        return childrenRepo.findAll(PageRequest.of(offset, page, Sort.by(Sort.Direction.DESC,col))).getContent();
    }
    public List<Children> ProductPagination(int offset,int page)
    {
        return childrenRepo.findAll(PageRequest.of(offset, page)).getContent();
    }
    public List<Children> SortBy(String col)
    {
        return childrenRepo.findAll(Sort.by(Sort.Direction.DESC,col));
    }
}
