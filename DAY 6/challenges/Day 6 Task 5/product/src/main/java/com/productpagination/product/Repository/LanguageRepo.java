package com.productpagination.product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productpagination.product.model.Language;

public interface LanguageRepo extends JpaRepository<Language,Integer>{
    
}
