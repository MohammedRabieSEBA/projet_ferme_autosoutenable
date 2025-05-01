package ferme;

class Saison {
    private SaisonType type;
    private int jour;

    public Saison(SaisonType type) {
        this.type = type;
        this.jour = 1;
    }

    public void prochainJour() {
        jour++;
        if (jour > 30) {
            jour = 1;
            // Changer de saison
        }
    }
}


