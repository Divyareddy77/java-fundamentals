package com.java.oop;

import java.sql.SQLOutput;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product=new Product();
       /* product.id=1;
        product.name="laptop";
        product.maxRetailPrice=100000;
        product.discountPercentage=10;
        product.rating=4;
        product.isAvailable=true;*/
        /*System.out.println("id "+product.id);
        System.out.println("name "+product.name);
        System.out.println("MRP "+product.maxRetailPrice);
        System.out.println("Discount percentage "+product.discountPercentage);
        System.out.println("Rating "+product.rating);
        System.out.println("Is availabe "+product.isAvailable);*/
        product.displayProductDetails();
        product.displayProductByCompany("Apple");
        product.displayByManufacturingYear(2026);
        product.displayManufacturingYearAndCompanyName(2025,"Apple");
        int totalproductCount= product.getTotalProductCount();
        System.out.println("count  :"+totalproductCount);
        long totalProductsValue=product.gettotalProductsValue();
        System.out.println("total product value : "+totalProductsValue);
        List<Product> productList= product.filterProductsBasedOnPrice(1000,200000);
        System.out.println("Product list : "+productList);

        System.out.println("---------------------------");

        Product product2=new Product(2,"laptop",100000,10,4,false,"Apple");
        /*product2.id=2;
        product2.name="laptop";
        product2.maxRetailPrice=100000;
        product2.discountPercentage=10;
        product2.rating=4;
        product2.isAvailable=false;*/
       /* System.out.println("id "+product2.id);
        System.out.println("name "+product2.name);
        System.out.println("MRP "+product2.maxRetailPrice);
        System.out.println("Discount percentage "+product2.discountPercentage);
        System.out.println("Rating "+product2.rating);
        System.out.println("Is availabe "+product2.isAvailable);*/
        product2.displayProductDetails();

        System.out.println("-------------------");


        Customer customer=new Customer();
       /* System.out.println("customer id "+customer.id);
        System.out.println("customer name "+customer.name);
        System.out.println("Phone number is "+customer.phoneNumber);
        System.out.println("Address is "+customer.address);*/
        customer.customerProfileDisplay();
        String newAddress=customer.updateCustomerAddress(1,"Hyderabad");
        System.out.println("updated address is :"+newAddress);
        boolean customerStatus=customer.customerActiveStatus();
        System.out.println("customer status is :"+customerStatus);
        customer.deactivateCustomerAccount(true);

        System.out.println("-------------------------");

       /* Customer customer1=new Customer(2,"Ammu","ammu@gmail.com",1343546L,"Hyderabad");
        System.out.println("customer id "+customer1.id);
        System.out.println("customer name "+customer1.name);
        System.out.println("Phone number is "+customer1.phoneNumber);
        System.out.println("Address is "+customer1.address);*/
        System.out.println("-------------------------------");


        Order order=new Order();
        int totalOrderAmount=order.totalOrderAmount();
        System.out.println("total order amount= "+totalOrderAmount);
        order.updateOrderStatuis();
        boolean isPaid=order.orderIspaid();
        System.out.println("Is order paid : "+isPaid);
        order.cancelAnOrder("shipped");
        order.displayOrderSummary();

        /*System.out.println("order id "+order.id);
        System.out.println("order date "+order.date);
        System.out.println("status "+order.status);
        System.out.println("Payment method "+order.paymentMethod);
        System.out.println("customer id "+order.customerId);*/
        System.out.println("-----------------------------");


        /*Order order1=new Order(37676843L,"12-3-26","delivered","upi",2);
        System.out.println("order id "+order.id);
        System.out.println("order date "+order.date);
        System.out.println("status "+order.status);
        System.out.println("Payment method "+order.paymentMethod);
        System.out.println("customer id "+order.customerId);
*/
        Payment payment=new Payment();
        payment.initiatePayment();
        boolean validatePayment=payment.validatePaymentAmount(1900,1900);
        System.out.println("payment validation :"+validatePayment);
        payment.processPayment("UPI");
        payment.refundPayment("cancelled");
        payment.checkPaymentStatus();
        RegularCustomer regularCustomer=new RegularCustomer(1,"divya","duv@gmail.com",9487585,"hyd",true,29485,5);
        regularCustomer.displayRegularCustomer();
        PremiumCustomer premiumCustomer=new PremiumCustomer(2,"ammu","ammu@gmail.com",243545,"hyd",true,"premium",4);
        premiumCustomer.displayPremiuimCustomer();
        System.out.println("id : "+customer.id);
        System.out.println("name :"+customer.name);
        }
    }
