package com.java.oop;

public class RegularCustomer extends Customer{
    double purchaseAmount;
    double discount;

    public RegularCustomer() {
        super();
        System.out.println("RegularCustomer constructor");
    }

    public RegularCustomer(int id,String name, String email,long phoneNumber,String address,boolean isActive,double purchaseAmount, double discount) {
        super(id,name,email,phoneNumber,address);
        this.purchaseAmount = purchaseAmount;
        this.discount = discount;
    }
    void displayRegularCustomer(){
        customerProfileDisplay();
        System.out.println("purchase amount : "+purchaseAmount);
        System.out.println("discount :"+discount);
    }
}
