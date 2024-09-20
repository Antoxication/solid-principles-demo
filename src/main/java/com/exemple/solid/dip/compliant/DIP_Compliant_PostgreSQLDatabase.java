package com.exemple.solid.dip.compliant;

public class DIP_Compliant_PostgreSQLDatabase implements DIP_Compliant_IDatabase {
    @Override
    public void connect() {
        System.out.println("Connecté à PostgreSQL.");
    }
}
