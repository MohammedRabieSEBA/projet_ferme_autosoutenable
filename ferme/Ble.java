package ferme;

class Ble extends Plante {
    public Ble() {
        super("Blé", 400);
        this.capaciteEau = 0.3;
        this.eauActuelle = capaciteEau;
        this.nourritureRestante = 700;
        this.consommationEau = 1;
        this.consommationFertilisant = 50;
    }

    @Override
    public void croitre() {
        // Croissance proportionnelle à la taille actuelle
    }

    @Override
    public void consommerRessources(Case c) {
        // Réduction eau et fertilisant
    }
}

