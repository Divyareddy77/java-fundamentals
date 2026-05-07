package com.java.oop.interfaces;

public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer(1,"customer1","customer1@gmail.com",34567654L,234567654L);
        ApplicationForm applicationForm= new ApplicationForm(1,"bith certificate",customer);
        Mro mro=new Mro("divya",1000);
        Attender attender=new Attender(1,"avdd",600,mro);
        PrintService printService=new ColourPrintService();
        CertificateService certificateService=new CertificateServiceImpl(attender,printService);
        Certificate certificate=certificateService.getMyCertificate(applicationForm);



    }
}
