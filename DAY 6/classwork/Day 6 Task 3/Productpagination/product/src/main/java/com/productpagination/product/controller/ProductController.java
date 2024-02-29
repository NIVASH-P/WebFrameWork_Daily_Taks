package com.productpagination.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.productpagination.product.model.Product;
import com.productpagination.product.service.ProductService;

public class ProductController {
    @Autowired
    public ProductService productService;
    @PostMapping("/post")
    public Product postProduct(@RequestBody Product Product)
    {
        if(productService.postProduct(Product))
        {
            return Product;
        }
        else
        {
            return null;
        }
    }
    @GetMapping("/get/{off}/{page}")
    public List<Product> getByPage(@PathVariable("off") int off,@PathVariable("page") int page)
    {
        return productService.ProductPagination(off, page);
    }
    @GetMapping("/get/{off}/{page}/{col}")
    public List<Product> getByPage(@PathVariable("off") int off,@PathVariable("page") int page,@PathVariable("col") String col)
    {
        return productService.ProductPaginationbySort(off, page,col);
    }
    @GetMapping("/get/{col}")
    public List<Product> SortBy(@PathVariable("col") String col)
    {
        return productService.SortBy(col);
    }
}
