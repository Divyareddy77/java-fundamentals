package com.java.oop.interfaces;




public interface CertificateService {
    String USERNAME="admin";
    String PASSWORD="admin123";
    Certificate getMyCertificate(ApplicationForm form);
    default boolean authenticate(String username,String password){
        if(username.equals("admin")&&password.equals("admin123")) {
            return true;
        }
        else {
            return false;
        }
    }
}

