package com.exemple.solid.dip.compliant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class DIP_Compliant_UserServiceTest {

    @Mock
    private DIP_Compliant_IDatabase mockDatabase;

    @InjectMocks
    private DIP_Compliant_UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void performService_ShouldCallConnect() {
        // Arrange
        doNothing().when(mockDatabase).connect();

        // Act
        userService.performService();

        // Assert
        verify(mockDatabase, times(1)).connect();
    }

    @Test
    void performService_ShouldHandleDatabaseConnection() {
        // Arrange
        doThrow(new RuntimeException("Connection failed")).when(mockDatabase).connect();

        // Act & Assert
        try {
            userService.performService();
        } catch (RuntimeException e) {
            // Vérifiez que l'exception est bien propagée ou gérée
            // Adapté selon la logique de votre UserService
            assert(e.getMessage().equals("Connection failed"));
        }
    }
}
