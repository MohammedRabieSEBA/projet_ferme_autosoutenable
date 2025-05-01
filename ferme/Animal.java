package ferme;


/**
 * Classe abstraite pour les animaux.
 */
abstract class Animal extends Element {
    protected double eau;
    protected double nourriture;
    protected double capaciteEau;
    protected double capaciteNourriture;
    protected int dureeVie;
    protected boolean aFaim;
    protected boolean aSoif;

    public Animal(String nom, int prix) {
        super(nom, prix);
    }

    public abstract void deplacer(Case[][] terrain);
    public abstract void manger(Plante p);
    public abstract void boire(Case c);
    public abstract int produire();
}


