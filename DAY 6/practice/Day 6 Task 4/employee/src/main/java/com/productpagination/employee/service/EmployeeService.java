package com.productpagination.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.productpagination.employee.model.Employee;
import com.productpagination.employee.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    public EmployeeRepo employeeRepo;

    public Boolean postEmployee(Employee employee)
    {
        try{
            employeeRepo.save(employee);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public List<Employee> ProductPaginationbySort(int offset,int page,String col)
    {
        return employeeRepo.findAll(PageRequest.of(offset, page, Sort.by(Sort.Direction.DESC,col))).getContent();
    }
    public List<Employee> ProductPagination(int offset,int page)
    {
        return employeeRepo.findAll(PageRequest.of(offset, page)).getContent();
    }
    public List<Employee> SortBy(String col)
    {
        return employeeRepo.findAll(Sort.by(Sort.Direction.DESC,col));
    }
}
