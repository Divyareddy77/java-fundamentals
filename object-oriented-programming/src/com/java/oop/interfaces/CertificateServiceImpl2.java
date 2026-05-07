package com.java.oop.interfaces;

public class CertificateServiceImpl2 implements CertificateService {
    Mro mro;
    PrintService printService;

    CertificateServiceImpl2(Mro mro, PrintService printService){
        this.mro = mro;
        this.printService = printService;
    }
    @Override
    public Certificate getMyCertificate(ApplicationForm applicationForm) {
        if(authenticate("admin", "admin@123")) {
            Certificate generatedCertificate = mro.signCertificate(applicationForm);
            printService.printCertificate(generatedCertificate);
            return generatedCertificate;
        } else
            return null;
    }


}
