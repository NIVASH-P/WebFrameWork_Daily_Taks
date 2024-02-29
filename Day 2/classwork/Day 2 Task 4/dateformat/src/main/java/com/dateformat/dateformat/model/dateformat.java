package com.dateformat.dateformat.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class dateformat {
    String title;
    String author;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publicationDate;

    
    public dateformat(String title, String author, Date publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Date getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
    
}
