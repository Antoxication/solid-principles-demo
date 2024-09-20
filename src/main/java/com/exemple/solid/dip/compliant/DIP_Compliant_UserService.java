package com.exemple.solid.dip.compliant;

public class DIP_Compliant_UserService {
    private DIP_Compliant_IDatabase database;

    // Injection de dépendance via le constructeur
    public DIP_Compliant_UserService(DIP_Compliant_IDatabase database) {
        this.database = database;
    }

    public void performService() {
        database.connect();
        // Logique métier
    }
}
