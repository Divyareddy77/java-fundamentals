package com.java.maven;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private int streetNo;
    private String building;
    private String city;
    private String state;
    private int pincode;
}
