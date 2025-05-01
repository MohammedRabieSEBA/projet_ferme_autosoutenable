package ferme;

class Ferme {
    private int taille = 6;
    private Case[][] terrain;
    private int budget;

    public Ferme() {
        terrain = new Case[taille][taille];
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                terrain[i][j] = new Case(i, j);
            }
        }
        budget = 15000;
    }
}


