package ferme;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FenetreSimulation fenetre = new FenetreSimulation();
        fenetre.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
