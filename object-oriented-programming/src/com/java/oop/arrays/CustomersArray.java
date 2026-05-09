package com.java.oop.arrays;

import java.util.Arrays;

public class CustomersArray {
    public static void main(String[] args) {
        Customer[] customers = new Customer[4];
        customers[0] = new Customer(1, "customer1", "customer1@gmail.com", 23452121145L, (byte) 20, 'm');
        customers[1] = new Customer(3, "customer3", "customer2@gmail.com", 31223444545L, (byte) 30, 'f');
        customers[2] = new Customer(4, "customer4", "customer3@gmail.com", 24332345454L, (byte) 40, 'm');
        customers[3] = new Customer(2, "customer2", "customer4@gmail.com", 23423432545L, (byte) 50, 'f');
        for (Customer customer : customers) {
            customer.displayCustomerDetails();
        }
        Customer elderCustomer = customers[0];
        for (Customer customer : customers) {
            if (customer.age > elderCustomer.age)
                elderCustomer = customer;
        }
        System.out.println("------------------------------");
        elderCustomer.displayCustomerDetails();
        System.out.println("Male count :"+getMaleCount(customers));
        System.out.println("Female count :"+getFemaleCount(customers));
        System.out.println("Customer by id : "+getCustomerById(customers,1));


    }

    public static int getMaleCount(Customer[] customers) {
        int maleCount = 0;
        for (Customer customer : customers) {
            if (customer.gender == 'm')
                maleCount++;
        }
       return maleCount;
    }
    public static int getFemaleCount(Customer[] customers){
        int femaleCount = 0;
        for (Customer customer : customers) {
            if (customer.gender == 'f')
                femaleCount++;
        }
        return femaleCount;
    }
    public static Customer getCustomerById(Customer[] customers,int id){
        for(Customer customer: customers) {
            if (customer.id == id)
                return customer;
        }
            return null;


    }

}
