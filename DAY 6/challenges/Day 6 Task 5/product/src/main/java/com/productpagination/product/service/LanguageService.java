package com.productpagination.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.*;
import com.productpagination.product.Repository.LanguageRepo;
import com.productpagination.product.model.Language;

@Service
public class LanguageService {
    @Autowired
    public LanguageRepo languageRepo;

    public Boolean postLanguage(Language Language)
    {
        try{
            languageRepo.save(Language);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public List<Language> getAllList()
    {
        return languageRepo.findAll();
    }
    public List<Language> ProductPaginationbySort(int offset,int page,String col)
    {
        return languageRepo.findAll(PageRequest.of(offset, page, Sort.by(Sort.Direction.DESC,col))).getContent();
    }
    public List<Language> ProductPagination(int offset,int page)
    {
        return languageRepo.findAll(PageRequest.of(offset, page)).getContent();
    }
    public List<Language> SortBy(String col)
    {
        return languageRepo.findAll(Sort.by(Sort.Direction.DESC,col));
    }
}
