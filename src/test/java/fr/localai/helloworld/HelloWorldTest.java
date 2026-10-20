/**
 * Tests unitaires pour la classe HelloWorld.
 *
 * Ces tests vérifient :
 * 1. La méthode generateMessage() retourne exactement "Hello World!"
 * 2. La méthode main() écrit exactement "Hello World!" sur la sortie standard
 * 3. La sortie contient bien un saut de ligne final
 *
 * @author Claude Code (assisté par IA locale Ollama)
 * @version 1.0
 */
package fr.localai.helloworld;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Classe de tests unitaires pour HelloWorld.
 */
class HelloWorldTest {

    // Sortie standard originale, restaurée après chaque test
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    /**
     * Configure la sortie standard avant chaque test.
     */
    @BeforeEach
    void setUp() {
        // Rediriger la sortie vers le flux de capture
        System.setOut(new PrintStream(outputStream));
        outputStream.reset();
    }

    /**
     * Restaure la sortie standard après chaque test.
     */
    @AfterEach
    void tearDown() {
        // Restaurer la sortie standard originale
        System.setOut(originalOut);
    }

    /**
     * Test 1 : Vérifie que generateMessage() retourne exactement "Hello World!"
     *
     * Ce test vérifie le comportement de la méthode dédiée à la génération du message.
     */
    @Test
    void testGenerateMessage() {
        String message = HelloWorld.generateMessage();
        assertEquals("Hello World!", message);
    }

    /**
     * Test 2 : Vérifie que main() écrit exactement "Hello World!" sur la sortie standard
     *
     * Ce test capture la sortie standard et vérifie qu'elle contient exactement
     * le message attendu (sans le saut de ligne, qui est ajouté par println).
     */
    @Test
    void testMainOutput() {
        // Appeler main() pour générer la sortie
        HelloWorld.main(new String[]{});

        // Récupérer la sortie capturée
        String output = outputStream.toString();

        // Vérifier que le message est exactement "Hello World!" (sans les caractères de fin)
        // On utilise trim() pour éliminer les caractères de saut de ligne (\n ou \r\n)
        assertEquals("Hello World!", output.trim());
    }

    /**
     * Test 3 : Vérifie que la sortie contient bien un saut de ligne final
     *
     * Ce test vérifie que println() ajoute bien un saut de ligne à la fin.
     */
    @Test
    void testMainOutputHasNewline() {
        // Appeler main() pour générer la sortie
        HelloWorld.main(new String[]{});

        // Récupérer la sortie capturée
        String output = outputStream.toString();

        // Vérifier que la sortie se termine par un saut de ligne (\n)
        assertTrue(output.endsWith("\n"),
            "La sortie doit se terminer par un saut de ligne, mais elle est : '" + output + "'");
    }

}
