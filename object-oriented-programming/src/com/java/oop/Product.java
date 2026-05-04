package com.java.oop;

import java.util.List;

public class Product {
    //state
    //id,name discountPercentage,rating
    int id;
    String name;
    int maxRetailPrice;
    float discountPercentage;
    float rating;
    boolean isAvailable;
    String companyName;
    Product(){
        System.out.println("product constructor is called");
        id=1;
        name="laptop";
        maxRetailPrice=100000;
        discountPercentage=10;
        rating=4;
        isAvailable=true;
        companyName="Samsung";
    }

    public Product(int id, String name, int maxRetailPrice, float discountPercentage, float rating, boolean isAvailable,String companyName) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.isAvailable = isAvailable;
        this.companyName=companyName;

    }
    void displayProductDetails(){
        System.out.println("Product id : "+id);
        System.out.println("product name : "+name);
        System.out.println("MRP : "+maxRetailPrice);
        System.out.println("Discount percentage : "+discountPercentage);
        System.out.println("Rating : "+rating);
        System.out.println("Available : "+isAvailable);
        System.out.println("Company name : "+companyName);

    }
    void displayProductByCompany(String companyName) {
        System.out.println("Products by company :" + companyName);
    }
    void displayByManufacturingYear(int year){
        System.out.println("year :"+year);
    }
    void displayManufacturingYearAndCompanyName(int year,String companyName){
        System.out.println("Year and company name : "+year+companyName);
    }
    int getTotalProductCount(){
        return 10;
    }
    long gettotalProductsValue(){
        return 100000000L;
    }
    Product getHighestRatedProduct(){
        return new Product();
    }
    List<Product> sortProductsBasedOnRating(){
        return null;
    }
    List<Product> filterProductsBasedOnPrice(int maxPrice,int minPrice){
        return null;

    }

}

