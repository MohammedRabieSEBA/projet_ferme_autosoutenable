package ferme;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Node;
import javafx.collections.ObservableList;

public class FenetreSimulation extends Application {

    private final int TAILLE = 6;
    private GridPane grille;
    private Label budgetLabel;
    private Label saisonLabel;
    private Label jourLabel;
    private boolean simulationEnCours = false;

    private int jour = 1;
    private String saisonActuelle = "Automne";
    private int budget = 15000;
    private Case[][] terrain;

    @Override
    public void start(Stage primaryStage) {
        // Initialisation du terrain
        terrain = new Case[TAILLE][TAILLE];
        for (int i = 0; i < TAILLE; i++) {
            for (int j = 0; j < TAILLE; j++) {
                terrain[i][j] = new Case(i, j);
            }
        }

        // Création des éléments principaux
        VBox root = new VBox(20);
        root.setPadding(new Insets(20));
        root.setStyle("-fx-background-color: #f0f8ff;"); // Bleu clair

        grille = new GridPane();
        grille.setAlignment(Pos.CENTER);
        grille.setHgap(5);
        grille.setVgap(5);
        grille.setPadding(new Insets(10));

        // Création des cases
        for (int i = 0; i < TAILLE; i++) {
            for (int j = 0; j < TAILLE; j++) {
                StackPane casePane = new StackPane();
                casePane.setPrefSize(60, 60);
                casePane.setStyle("-fx-background-color: #ffffff; -fx-border-color: #dcdcdc; -fx-border-radius: 8; -fx-background-radius: 8;");
                grille.add(casePane, j, i);
            }
        }

        // Créer un bouton Start/Pause
        Button boutonStartPause = new Button("Démarrer");
        boutonStartPause.setFont(Font.font(16));
        boutonStartPause.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-background-radius: 10;");
        boutonStartPause.setOnAction(e -> {
            simulationEnCours = !simulationEnCours;
            boutonStartPause.setText(simulationEnCours ? "Pause" : "Démarrer");
            if (simulationEnCours) {
                lancerSimulation();
            }
        });

        // Section info
        HBox infos = new HBox(30);
        infos.setAlignment(Pos.CENTER);

        budgetLabel = new Label("Budget: 15000€");
        saisonLabel = new Label("Saison: Automne");
        jourLabel = new Label("Jour: 1");

        budgetLabel.setFont(Font.font(14));
        saisonLabel.setFont(Font.font(14));
        jourLabel.setFont(Font.font(14));

        infos.getChildren().addAll(budgetLabel, saisonLabel, jourLabel);

        // Ajout au layout principal
        root.getChildren().addAll(grille, boutonStartPause, infos);

        Scene scene = new Scene(root, 600, 700);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ferme Autosoutenable - Simulation");
        primaryStage.show();
    }

    // Méthode pour lancer la simulation avec un timer (avance le jour automatiquement)
    private void lancerSimulation() {
        Timeline timeline = new Timeline(
            new KeyFrame(Duration.seconds(1), e -> {
                // Avancer d'un jour chaque seconde
                jour++;
                jourLabel.setText("Jour: " + jour);

                // Gérer les saisons
                if (jour > 30) {
                    jour = 1;
                    changerSaison();
                }

                // Mise à jour de la grille
                mettreAJourGrille();
            })
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    // Méthode pour changer de saison
    private void changerSaison() {
        switch (saisonActuelle) {
            case "Automne":
                saisonActuelle = "Hiver";
                break;
            case "Hiver":
                saisonActuelle = "Printemps";
                break;
            case "Printemps":
                saisonActuelle = "Été";
                break;
            case "Été":
                saisonActuelle = "Automne";
                break;
        }
        saisonLabel.setText("Saison: " + saisonActuelle);
    }

    // Méthode pour mettre à jour la grille en fonction des éléments
    private void mettreAJourGrille() {
        for (int i = 0; i < TAILLE; i++) {
            for (int j = 0; j < TAILLE; j++) {
                StackPane casePane = (StackPane) getNodeByRowColumnIndex(i, j);
                casePane.setStyle("-fx-background-color: " + getCouleurCase(terrain[i][j]) + ";");
            }
        }
    }

    // Retourne la couleur en fonction de ce qui se trouve sur la case
    private String getCouleurCase(Case c) {
        if (c.getAnimal() != null) {
            return "#FFD700"; // Jaune pour animal
        } else if (c.getPlante() != null) {
            return "#32CD32"; // Vert pour plante
        } else if (c.getPuits() != null) {
            return "#0000FF"; // Bleu pour puits
        } else {
            return "#FFFFFF"; // Blanc pour case vide
        }
    }

    // Permet de retrouver un Node (une case) dans le GridPane à partir de ses indices
    private Node getNodeByRowColumnIndex(final int row, final int column) {
        Node result = null;
        ObservableList<Node> childrens = grille.getChildren();
        for (Node node : childrens) {
            if (GridPane.getRowIndex(node) == row && GridPane.getColumnIndex(node) == column) {
                result = node;
                break;
            }
        }
        return result;
    }
}
