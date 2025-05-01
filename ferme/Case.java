package ferme;


/**
 * Représente une case du champ.
 */
// Classe Case
class Case {
    private int x, y;
    private Animal animal;
    private Plante plante;
    private Puits puits;
    private double eau;
    private double fertilisant;

    public Case(int x, int y) {
        this.x = x;
        this.y = y;
        this.eau = 0;
        this.fertilisant = 0;
    }

    // Getter pour l'animal
    public Animal getAnimal() {
        return animal;
    }

    // Setter pour l'animal
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    // Getter pour la plante
    public Plante getPlante() {
        return plante;
    }

    // Setter pour la plante
    public void setPlante(Plante plante) {
        this.plante = plante;
    }

    // Getter pour le puits
    public Puits getPuits() {
        return puits;
    }

    // Setter pour le puits
    public void setPuits(Puits puits) {
        this.puits = puits;
    }
}



