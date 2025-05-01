package ferme;

public class Simulation {
    private Ferme ferme;
    private Saison saison;

    public Simulation() {
        ferme = new Ferme();
        saison = new Saison(SaisonType.AUTOMNE);
    }

    public void lancer() {
        // Boucle des 30 jours
    }
} 

// Interface graphique et gestion des événements seront à ajouter dans un autre fichier avec JavaFX ou Swing
