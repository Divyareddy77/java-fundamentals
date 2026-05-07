package com.java.oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer(1,"customer1","customer1@gmail.com",34567654L,234567654L);
        ApplicationForm applicationForm=new ApplicationForm(1,"bith certificate",customer);
        Mro mro=new Mro("divya",1000);
        Attender attender=new Attender(1,"avdd",600,mro);
        CertificateService certificateService=new certificateServiceImpl(attender);
        Certificate certificate=certificateService.getMyCertificate(applicationForm);
        PrintService printService=new ColourPrintService();
        printService.printService(certificate);


    }
}
