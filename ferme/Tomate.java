package ferme;

class Tomate extends Plante {
    public Tomate() {
        super("Tomate", 1200);
        this.capaciteEau = 0.4;
        this.eauActuelle = capaciteEau;
        this.nourritureRestante = 1000;
        this.consommationEau = 1;
        this.consommationFertilisant = 20;
    }

    @Override
    public void croitre() {
        // Implémentation de la croissance avec modificateurs météo
    }

    @Override
    public void consommerRessources(Case c) {
        // Réduction eau et fertilisant
    }
}


