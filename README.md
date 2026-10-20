# Hello World AI

[![Java](https://img.shields.io/badge/Java-21+-blue.svg)](https://www.oracle.com/java/technologies/javase/downloads.html)
[![Maven](https://img.shields.io/badge/Maven-3.9+-green.svg)](https://maven.apache.org/)
[![JUnit](https://img.shields.io/badge/JUnit-5.11+-orange.svg)](https://junit.org/junit5/)

## Présentation

Ce projet est un Hello World minimaliste mais structuré selon les bonnes pratiques de développement Java. Il affiche exactement :

```
Hello World!
```

Le code a été conçu et vérifié avec l'assistance d'une intelligence artificielle locale, démontrant qu'un logiciel fonctionnel peut être développé sans connexion internet ni service cloud.

## Technologies

- **Java 21+ LTS** - Langage de programmation Java version Long Term Support
- **Apache Maven 3.9+** - Outil de gestion de dépendances et de compilation
- **JUnit Jupiter 5.11+** - Framework de tests unitaires
- **UTF-8** - Encodage des fichiers sources

## Prérequis

Avant de commencer, vérifiez que Java et Maven sont installés :

```bash
java -version
mvn -version
```

Vous devriez voir des versions compatibles (Java 21+ et Maven 3.9+) dans les sorties.

## Compilation et tests

### Compilation avec tests

```bash
mvn clean test
```

Cette commande :
- Nettoie les fichiers générés précédents (`clean`)
- Compile le code source
- Exécute tous les tests unitaires
- Affiche le résultat des tests

### Création du package

```bash
mvn clean package
```

Cette commande compile le projet et crée un fichier JAR dans `target/hello-world-1.0.0-SNAPSHOT.jar`.

## Exécution

Après compilation, vous pouvez exécuter le programme de plusieurs façons :

### Méthode 1 : Via Maven (recommandée)

```bash
mvn exec:java -Dexec.mainClass="fr.localai.helloworld.HelloWorld"
```

### Méthode 2 : Exécution directe du JAR

```bash
java -cp target/hello-world-1.0.0-SNAPSHOT.jar fr.localai.helloworld.HelloWorld
```

### Résultat attendu

```
Hello World!
```

**Vérification effectuée :** La sortie est exactement `Hello World!` avec un saut de ligne final.

## Architecture

```
hello-world-ai/
├── pom.xml                      # Configuration Maven et dépendances
├── README.md                    # Ce fichier de documentation
├── .gitignore                   # Fichier d'ignoration pour Git
└── src/
    ├── main/
    │   └── java/
    │       └── fr/
    │           └── localai/
    │               └── helloworld/
    │                   └── HelloWorld.java    # Classe principale
    └── test/
        └── java/
            └── fr/
                └── localai/
                    └── helloworld/
                        └── HelloWorldTest.java  # Tests unitaires
```

### Rôle de chaque fichier

- **pom.xml** : Définit les coordonnées Maven, les dépendances (JUnit), et configure les plugins de compilation et de test.
- **HelloWorld.java** : Implémentation principale avec une méthode `generateMessage()` séparée pour permettre le test unitaire.
- **HelloWorldTest.java** : Tests unitaires JUnit 5 vérifiant la génération du message, la sortie standard et le saut de ligne.
- **.gitignore** : Exclut les fichiers générés (`target/`), les configurations IDE locales et les fichiers temporaires.

## Qualité et tests

Les tests unitaires vérifient :

1. **testGenerateMessage()** : La méthode `generateMessage()` retourne exactement `"Hello World!"`
2. **testMainOutput()** : La méthode `main()` écrit exactement `"Hello World!"` sur la sortie standard
3. **testMainOutputHasNewline()** : La sortie contient bien un saut de ligne final

Chaque test est indépendant, déterministe et ne nécessite aucune ressource externe (pas de réseau, pas de serveur).

## Création avec une IA locale

Ce projet a été conçu avec l'assistance d'une intelligence artificielle locale, exécutée directement sur la machine du développeur.

### Outils utilisés

- **Ollama** : Plateforme pour exécuter des modèles d'IA localement
- **Modèle** : `rafw007/qwen35-claude-coder:9b` - Modèle 9 milliards de paramètres spécialisé en développement
- **Claude Code** : Interface agentique pour le développement assisté par IA

### Commandes utilisées

Pour télécharger et utiliser le modèle (si Ollama est déjà installé) :

```bash
ollama pull rafw007/qwen35-claude-coder:9b
ollama run claude --model rafw007/qwen35-claude-coder:9b
```

Ces commandes supposent qu'Ollama et Claude Code sont déjà installés et configurés sur votre système.

### Note sur la confidentialité

Le modèle est exécuté localement sur votre machine, mais le comportement de l'interface, ses paramètres et ses éventuelles connexions réseau dépendent de la configuration réelle d'Ollama. La confidentialité des données traitées dépend de votre configuration système et des paramètres de sécurité d'Ollama.

### Important

La création assistée par IA ne dispense pas de la revue du code et de la vérification des tests par un humain. Ce projet a été entièrement vérifié, compilé et testé avant publication.

## Licence

Aucune licence open source n'a encore été sélectionnée pour ce projet. Avant de le présenter comme un projet open source sur GitHub, il faudra choisir une licence appropriée (MIT, Apache 2.0, GPL, etc.).

## Prochaines étapes pour GitHub

Pour publier ce projet sur GitHub :

1. Initialiser un dépôt Git :
   ```bash
   git init
   git add .
   git commit -m "Initial commit: Hello World AI project"
   ```

2. Créer un dépôt sur GitHub et lier-le à votre dépôt local

3. Pousser le code :
   ```bash
   git remote add origin https://github.com/votre-utilisateur/votre-repo.git
   git push -u origin main
   ```

4. Ajouter une licence (ex: MIT) dans le dépôt GitHub

## Contribuer

Les contributions sont les bienvenues ! N'hésitez pas à :
- Signaler des bugs
- Proposer des améliorations
- Soumettre des pull requests

## Licence

Ce projet est actuellement sans licence. Veuillez consulter la section "Licence" ci-dessus pour plus d'informations.

---

*Généré avec l'aide d'une IA locale - Ollama + Qwen 3.5 Claude Coder 9B*
