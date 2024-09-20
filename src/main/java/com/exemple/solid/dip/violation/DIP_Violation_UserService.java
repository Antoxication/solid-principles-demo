package com.exemple.solid.dip.violation;

public class DIP_Violation_UserService {
    private DIP_Violation_MySQLDatabase database;

    public DIP_Violation_UserService() {
        this.database = new DIP_Violation_MySQLDatabase();
    }

    public void performService() {
        database.connect();
        // Logique métier
    }
}
