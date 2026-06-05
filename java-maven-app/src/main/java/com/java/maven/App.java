package com.java.maven;

import com.java.maven.enums.Gender;
import com.java.maven.enums.Role;
import com.java.maven.enums.Status;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Product product = Product.builder()
                .id(1)
                .name("Phone")
                .maxRetailPrice(100000)
                .company("Samsung")
                .status(Status.AVAILABLE)
            .build();
        System.out.println( "Hello World!" );
        Address address=Address.builder()
                .streetNo(3)
                .city("Hyderabad")
                .state("TG")
                .pincode(324556)
                .build();
        Customer customer=Customer.builder()
                .id(1)
                .name("customer1")
                .role(Role.CUSTOMER)
                .gender(Gender.FEMALE)
                .address(address)
                .build();
        System.out.println(customer);

    }
}
