package com.productpagination.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.productpagination.product.model.Product;
import com.productpagination.product.repository.ProductRepository;


@Service
public class ProductService {
    @Autowired
    public ProductRepository productRepository;

    public Boolean postProduct(Product Product)
    {
        try{
            productRepository.save(Product);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public List<Product> ProductPaginationbySort(int offset,int page,String col)
    {
        return productRepository.findAll(PageRequest.of(offset, page, Sort.by(Sort.Direction.DESC,col))).getContent();
    }
    public List<Product> ProductPagination(int offset,int page)
    {
        return productRepository.findAll(PageRequest.of(offset, page)).getContent();
    }
    public List<Product> SortBy(String col)
    {
        return productRepository.findAll(Sort.by(Sort.Direction.DESC,col));
    }
}
