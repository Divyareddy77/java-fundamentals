package com.java.oop.inheritance;

public class Book extends Product{
    String author;
    int pages;
    String publisherName;

    public Book() {
    }

    public Book(int id,String name,int maxRetailPrice, float disountPercentage,float rating, boolean isAvailable,String author, int pages, String publisherName) {
        super(id,name,maxRetailPrice,disountPercentage,rating,isAvailable);
        this.author = author;
        this.pages = pages;
        this.publisherName = publisherName;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Author : "+author);
        System.out.println("Pages :"+pages);
        System.out.println("publisher name :"+publisherName);
    }
}

