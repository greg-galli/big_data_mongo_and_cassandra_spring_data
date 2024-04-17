Description du projet
=

Ce projet a pour but d'aider les étudiants à la mise en place d'un projet exploitant Spring Data à la fois pour MongoDB et Cassandra.
Cet exemple a été réalisé avec l'aide inestimable de [Larboullet-Marin Andréa], merci à lui ;)


Tables des matières
=

   * [Environnement de développement](#environnement-de-développement)
   * [Installation](#installation)
      * [Prérequis](#prérequis)
      * [Installation et lancement](#installation-et-lancement)
   * [Utilisation](#utilisation)
   * [Mise en œuvre](#mise-en-œuvre)

Environnement de développement
=

- Langage : Java 17
- Framework : Spring Boot
- Base de données : MongoDB, Cassandra
- Outil de build : Maven
- Autres librairies : Lombok, Mapstruct, Swagger, JUnit, Mockito, ...

Installation
=
## Prérequis

- Java 17
- Docker

## Installation et lancement

1. Cloner le projet
2. Se placer à la racine du projet
3. Lancer les bases de données avec la commande `docker-compose up -d`
4. Installez les dépendances : `mvn install`
5. Lancer l'application avec la commande `mvn spring-boot:run`
6. L'application est accessible à l'adresse `http://localhost:8080`

Notez que l'essentiel du code important se trouve dans le main de l'application, vous y trouverez l'injection des repositories (devrait être fait via les services, mais pour l'exemple, c'est plus simple ainsi) qui sont utilisés pour créer une entité commune à la fois sur l'instance de Cassandra et de MongoDB.




