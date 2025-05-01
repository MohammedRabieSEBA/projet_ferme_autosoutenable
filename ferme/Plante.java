package ferme;

/**
 * Classe abstraite pour les plantes.
 */
abstract class Plante extends Element {
    protected double eauActuelle;
    protected double capaciteEau;
    protected int nourritureRestante;
    protected int consommationEau;
    protected int consommationFertilisant;

    public Plante(String nom, int prix) {
        super(nom, prix);
    }

    public abstract void croitre();
    public abstract void consommerRessources(Case c);
}

