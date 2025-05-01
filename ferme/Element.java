package ferme;

import java.util.*;

/**
 * Classe abstraite représentant tout élément plaçable dans une case.
 */
public abstract class Element {
    protected String nom;
    protected int prix;

    public Element(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }
}

