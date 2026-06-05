package com.java.maven;

import com.java.maven.enums.Gender;
import com.java.maven.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private int id;
    private String name;
    private Role role;
    private Gender gender;
    private Address address;
}
