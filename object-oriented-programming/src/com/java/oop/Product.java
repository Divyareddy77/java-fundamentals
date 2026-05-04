package com.java.oop;

public class Product {
    //state
    //id,name discountPercentage,rating
    int id;
    String name;
    int maxRetailPrice;
    float discountPercentage;
    float rating;
    boolean isAvailable;
    Product(){
        System.out.println("product constructor is called");
        id=1;
        name="laptop";
        maxRetailPrice=100000;
        discountPercentage=10;
        rating=4;
        isAvailable=true;
    }

    public Product(int id, String name, int maxRetailPrice, float discountPercentage, float rating, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.isAvailable = isAvailable;
    }
}

