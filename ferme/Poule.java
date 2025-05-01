package ferme;

class Poule extends Animal {
    public Poule() {
        super("Poule", 500);
        this.capaciteEau = 0.7;
        this.capaciteNourriture = 2000;
        this.eau = capaciteEau;
        this.nourriture = capaciteNourriture;
        this.dureeVie = 2;
    }

    @Override
    public void deplacer(Case[][] terrain) {
        // Déplacement aléatoire sur cases voisines vides
    }

    @Override
    public void manger(Plante p) {
        // Consomme calories de la plante
    }

    @Override
    public void boire(Case c) {
        // Si puits présent, boit
    }

    @Override
    public int produire() {
        return 100; // œuf en calories
    }
}


