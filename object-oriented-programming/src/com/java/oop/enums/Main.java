package com.java.oop.enums;

public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        product.setId(1);
        product.setName("Phone");
        product.setCompany(Company.SAMSUNG);
        product.setCategory(Category.ELECTRONICS);
        System.out.printf("%-4s %-10s %-20s %-10s %-15s","Id","Name","Category","Company","Discount");
        System.out.printf("\n%-4d %-10s %-20s %-10s %-15d",product.getId(),product.getName(),product.getCategory(),product.getCompany().getDisplayName(),product.getCategory().getDefaultDiscount());
    }
}
