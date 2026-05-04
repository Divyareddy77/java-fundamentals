package com.java.oop;

public class Customer {
    int id;
    String name;
    String email;
    long phoneNumber;
    String address;
    boolean isActive;
    Customer(){
        id=1;
        name="Divya";
        email="divya@gmail.com";
        phoneNumber=83757838623L;
        address="hyerabad";
        isActive=true;


    }

    public Customer(int id, String name, String email, long phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.isActive=true;
    }
    void customerProfileDisplay(){
        System.out.println("customer id "+id);
        System.out.println("customer name "+name);
        System.out.println("Phone number is "+phoneNumber);
        System.out.println("Address is "+address);
    }
    String  updateCustomerAddress(String newAddress){
        address=newAddress;
        return address;

    }
    boolean customerActiveStatus(){
        return isActive;
    }
    void deactivateCustomerAccount(boolean isActive){
        isActive=false;
        System.out.println("Deactivated customer account");


    }


}
