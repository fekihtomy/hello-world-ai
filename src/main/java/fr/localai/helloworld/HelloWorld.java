/**
 * Classe principale Hello World.
 *
 * Cette classe démontre une implémentation simple et testable d'un programme Hello World.
 * La logique d'affichage est séparée de la méthode main pour permettre le test unitaire.
 *
 * @author Claude Code (assisté par IA locale Ollama)
 * @version 1.0
 */
package fr.localai.helloworld;

/**
 * Classe principale du programme Hello World.
 *
 * Cette classe contient une méthode statique main qui affiche le message
 * "Hello World!" sur la sortie standard.
 */
public class HelloWorld {

    /**
     * Message affiché par le programme.
     */
    private static final String MESSAGE = "Hello World!";

    /**
     * Méthode principale du programme.
     *
     * Cette méthode est l'entrée point du programme Java.
     * Elle appelle la méthode {@link #generateMessage()} pour obtenir le message
     * à afficher, puis l'imprime sur la sortie standard avec un saut de ligne.
     *
     * @param args Les arguments en ligne de commande (non utilisés)
     */
    public static void main(String[] args) {
        // Générer et afficher le message
        String message = generateMessage();
        System.out.println(message);
    }

    /**
     * Génère le message à afficher.
     *
     * Cette méthode est séparée de la méthode main pour permettre
     * des tests unitaires indépendants.
     *
     * @return Le message "Hello World!"
     */
    public static String generateMessage() {
        return MESSAGE;
    }

}
