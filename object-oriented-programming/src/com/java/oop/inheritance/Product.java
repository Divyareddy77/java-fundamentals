package com.java.oop.inheritance;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    float discountPercentage;
    float rating;
    boolean isAvailable;

    public Product() {
        System.out.println("product constructor is called");
    }

    public Product(int id, String name, int maxRetailPrice, float discountPercentage, float rating, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.isAvailable = isAvailable;
    }
    void displayDetails(){
        System.out.println("id :"+id);
        System.out.println("name :"+name);
        System.out.println("MRP :"+maxRetailPrice);
        System.out.println("Discount percentage :"+discountPercentage);
        System.out.println("rating :"+rating);
        System.out.println("Available :"+isAvailable);
    }
    void displayDetails(String companyName){
        System.out.println("COmpany :"+companyName);
    }
    void displayDetails(String companyName,int year){
        System.out.println("Company :"+companyName+"Year :"+year);
    }
}
