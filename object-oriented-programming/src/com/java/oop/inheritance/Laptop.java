package com.java.oop.inheritance;

public class Laptop extends Product{
    int harddiskSize;
    int ram;
    String operatingSystem;

    public Laptop() {
        super();
        System.out.println("laptop constructor called");
    }

    public Laptop(int id,String name,int maxRetailPrice,float discountPercentage,float rating,boolean isAvailable,int harddiskSize, int ram, String operatingSystem) {
        super(id,name,maxRetailPrice,discountPercentage,rating,isAvailable);
        this.harddiskSize = harddiskSize;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("hard disk size : "+harddiskSize);
        System.out.println("ram : "+ram);
        System.out.println("operating system : "+operatingSystem);
    }
    void displayDetails(String companyName,int year,boolean isAvailable){
        System.out.println("companyName "+companyName+"year :"+year+"Available :"+isAvailable);
    }
}
