package com.java.oop.interfaces;

public class ColourPrintService implements PrintService {
    @Override
    public void printCertificate(Certificate certificate) {
        System.out.println("printing in colour");
        System.out.println("id: "+certificate.id
                +"\nname: " +certificate.name+
                "\nissued by: "+certificate.issuedBy+
                "\nissued to: "+certificate.issuedTo+
                "\nissued date :"+certificate.issuedDate);

    }
}
