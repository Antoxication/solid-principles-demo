package com.exemple.solid.dip.compliant;

public class DIP_Compliant_MySQLDatabase implements DIP_Compliant_IDatabase {
    @Override
    public void connect() {
        System.out.println("Connecté à MySQL.");
    }
}
