package com.exemple.solid.dip.violation;

import org.junit.jupiter.api.Test;

class DIP_Violation_UserServiceTest {

    @Test
    void testPerformService_Violation() {
        // Instancier directement la classe violant le DIP
        DIP_Violation_UserService userService = new DIP_Violation_UserService();

        // Exécuter la méthode à tester
        userService.performService();

        // Vérifier manuellement les effets (par exemple, vérifier la sortie console)
        // Idéalement, utilisez des outils comme SystemOutRule ou autres frameworks de test pour capturer la sortie
    }
}
