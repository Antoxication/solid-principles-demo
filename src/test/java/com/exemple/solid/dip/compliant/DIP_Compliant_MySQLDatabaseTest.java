package com.exemple.solid.dip.compliant;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DIP_Compliant_MySQLDatabaseTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private DIP_Compliant_MySQLDatabase mysqlDatabase;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        mysqlDatabase = new DIP_Compliant_MySQLDatabase();
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testConnect_PrintsCorrectMessage() {
        mysqlDatabase.connect();
        String expectedOutput = "Connecté à MySQL." + System.lineSeparator();
        assertTrue(outContent.toString().contains(expectedOutput));
    }
}
