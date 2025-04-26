# Projet : Simulation d'une Ferme Autosoutenable

## Description Générale

Ce projet est une simulation interactive d'une **ferme autosuffisante** développée en **Java**.  
Le joueur incarne un agriculteur gérant ses ressources sur une grille de **6 × 6 cases** pour maximiser sa production au fil des saisons.  
Chaque case peut accueillir des **animaux** (poules ou vaches), des **plantes** (tomates ou blé) ou un **puits** d'eau, selon des règles précises de gestion des ressources et d'interaction entre les entités.

Le projet est organisé selon les **principes de Programmation Orientée Objet** (POO) afin de permettre une évolution facile et une architecture claire et maintenable.

## Fonctionnalités Principales

- **Simulation automatique** des journées pendant chaque saison (30 jours par saison).
- **Gestion des ressources** : nourriture, eau, fertilisant, argent.
- **Déplacement automatique** des animaux et interactions avec leur environnement (manger, boire, produire de la nourriture).
- **Croissance automatique** des plantes en fonction de l'eau et du fertilisant disponible.
- **Gestion des saisons** avec des effets spécifiques (pluie, sécheresse, reproduction, gel...).
- **Système d'entrepôt** pour stocker la production (lait, œufs, blé, tomates).
- **Phase d'interaction** avec l'utilisateur entre les saisons : achat/vente d'animaux, plantes, fertilisant, construction/destruction de puits.
- **Interface graphique** simple pour visualiser l'état de la ferme et les stocks.

## Exécution du Projet

### Prérequis

- **Java 17** ou une version plus récente.
- Un IDE Java (IntelliJ IDEA, Eclipse, NetBeans...) ou simplement le terminal avec `javac` et `java`.

### Lancement

1. **Cloner** ou **télécharger** le projet dans un dossier local.
2. **Compiler** tous les fichiers `.java` :
   ```bash
   javac *.java
    ```
3. **Lancer** la simulation :
   ```bash
   java Main
   ```
4. Une **interface graphique** s'ouvre avec :
   - La **grille** de la ferme en couleur.
   - Un **bouton** pour démarrer/pause la simulation.
   - Une **section de stocks** pour suivre les ressources disponibles.

5. La simulation s'exécute **automatiquement** pendant une saison entière.  
   À la fin de la saison, la simulation se **met en pause** pour permettre au joueur d'acheter de nouveaux éléments avant de reprendre.

---

## Organisation du Code

- `Main.java` : Point d'entrée du programme.
- `Ferme.java` : Gestion globale de la ferme et de la simulation.
- `Case.java` : Modélisation d'une case de la grille.
- `Animal.java` *(abstrait)* : Classe mère des animaux (Poule, Vache).
- `Poule.java` / `Vache.java` : Spécialisation des animaux.
- `Plante.java` *(abstrait)* : Classe mère des plantes (Tomate, Blé).
- `Tomate.java` / `Ble.java` : Spécialisation des plantes.
- `Puits.java` : Gestion des puits d'eau.
- `Entrepot.java` : Gestion des ressources stockées (nourriture, fertilisant).
- `Magasin.java` : Gestion des achats/ventes entre les saisons.
- `Saison.java` : Gestion du déroulement des saisons (effets, reproduction, événements météorologiques).

*(Chaque fichier est correctement commenté avec une Javadoc détaillée.)*

---

## Auteur

Projet réalisé par **SEBA Mohammed Rabie**  
Encadré par **John Chaussard** – **USPN Université Paris 13**
