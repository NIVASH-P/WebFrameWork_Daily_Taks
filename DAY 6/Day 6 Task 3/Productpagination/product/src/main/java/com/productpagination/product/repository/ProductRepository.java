package com.productpagination.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productpagination.product.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{
    
}
