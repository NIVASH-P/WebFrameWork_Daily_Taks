package com.paginationandsorting.paginationandsorting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paginationandsorting.paginationandsorting.model.Children;
import com.paginationandsorting.paginationandsorting.service.ChildrenService;

@RestController
public class ChildrenController {
    @Autowired
    public ChildrenService childrenService;

    @PostMapping("/post")
    public Children postChildren(@RequestBody Children children)
    {
        if(childrenService.postChildren(children))
        {
            return children;
        }
        else
        {
            return null;
        }
    }

    @GetMapping("/get")
    public List<Children> getAll()
    {
        return childrenService.getAllList();
    }
    @GetMapping("/get/{off}/{page}")
    public List<Children> getByPage(@PathVariable("off") int off,@PathVariable("page") int page)
    {
        return childrenService.ProductPagination(off, page);
    }
    @GetMapping("/get/{off}/{page}/{col}")
    public List<Children> getByPage(@PathVariable("off") int off,@PathVariable("page") int page,@PathVariable("col") String col)
    {
        return childrenService.ProductPaginationbySort(off, page,col);
    }
    @GetMapping("/get/{col}")
    public List<Children> SortBy(@PathVariable("col") String col)
    {
        return childrenService.SortBy(col);
    }
}
