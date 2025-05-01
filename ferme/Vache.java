package ferme;

class Vache extends Animal {
    public Vache() {
        super("Vache", 1500);
        this.capaciteEau = 6.0;
        this.capaciteNourriture = 6000;
        this.eau = capaciteEau;
        this.nourriture = capaciteNourriture;
        this.dureeVie = 3;
    }

    @Override
    public void deplacer(Case[][] terrain) {
        // Déplacement aléatoire
    }

    @Override
    public void manger(Plante p) {
        // Manger plante
    }

    @Override
    public void boire(Case c) {
        // Boit au puits
    }

    @Override
    public int produire() {
        return 600; // lait
    }
}

class Puits extends Element {
    public Puits() {
        super("Puits", 3000);
    }
}


