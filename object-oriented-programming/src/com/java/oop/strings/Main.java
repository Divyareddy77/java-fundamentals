package com.java.oop.strings;

import com.java.oop.Customer;

import java.util.SplittableRandom;

public class Main {
    static String name;
    public static void main(String[] args) {
        String str1=new String();
        System.out.println(str1);
        String name=null;
        System.out.println(name);
        char[] chars={'a','b','c','d'};
        String str2=new String(chars);
        System.out.println(str2);
        String str3=new String("abcd");
        System.out.println(str2 == str3);
        String str4="abcd";
        String str5="abcd";
        System.out.println(str4==str5);


        //string manipuation
        System.out.println(str4.charAt(0));

        String username="admin1";
        String password="admin123";
        System.out.println(username.compareToIgnoreCase("Admin1"));
        String greeting="Hello ";
        greeting=greeting.concat(username);
        System.out.println(greeting);
        if(username.equalsIgnoreCase("admin1") && password.equals("admin123")){
            System.out.println("Login succesful");
        }
        else{
            System.out.println("invalid credentials");
        }


        if(username.length()>5 && username.length()<10)
            System.out.println("username length is valid");
        else
            System.out.println("username length is invalid");



        //regular expression
        String regex="^[a-zA-Z0-9_]+$";
        if(username.matches(regex))
            System.out.println("usename is valid");
        else
            System.out.println("username is invalid");







    }
}
