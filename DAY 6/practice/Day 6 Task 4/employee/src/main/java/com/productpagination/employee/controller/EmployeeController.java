package com.productpagination.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productpagination.employee.model.Employee;
import com.productpagination.employee.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;

    @PostMapping("/post")
    public Employee postEmployee(@RequestBody Employee employee)
    {
        if(employeeService.postEmployee(employee))
        {
            return employee;
        }
        else
        {
            return null;
        }
    }
    @GetMapping("/get/{off}/{page}")
    public List <Employee> getByPage(@PathVariable("off") int off,@PathVariable("page") int page)
    {
        return employeeService.ProductPagination(off, page);
    }
    @GetMapping("/get/{off}/{page}/{col}")
    public List<Employee> getByPage(@PathVariable("off") int off,@PathVariable("page") int page,@PathVariable("col") String col)
    {
        return employeeService.ProductPaginationbySort(off, page,col);
    }
    @GetMapping("/get/{col}")
    public List<Employee> SortBy(@PathVariable("col") String col)
    {
        return employeeService.SortBy(col);
    }
}
