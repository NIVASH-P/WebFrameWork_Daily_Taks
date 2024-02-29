package com.productpagination.product.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Language {
    @Id
    private int LanguageId;
    private String LanguageName;
    private int LanguageCode;
    private String Country;
    public Language() {
    }
    public Language(int languageId, String languageName, int languageCode, String country) {
        LanguageId = languageId;
        LanguageName = languageName;
        LanguageCode = languageCode;
        Country = country;
    }
    public int getLanguageId() {
        return LanguageId;
    }
    public void setLanguageId(int languageId) {
        LanguageId = languageId;
    }
    public String getLanguageName() {
        return LanguageName;
    }
    public void setLanguageName(String languageName) {
        LanguageName = languageName;
    }
    public int getLanguageCode() {
        return LanguageCode;
    }
    public void setLanguageCode(int languageCode) {
        LanguageCode = languageCode;
    }
    public String getCountry() {
        return Country;
    }
    public void setCountry(String country) {
        Country = country;
    }
    
}
