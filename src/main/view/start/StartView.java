package main.view.start;

import javafx.scene.control.*;
import javafx.scene.layout.*;

/**
 * De view dat bij de start scherm getoond wordt.
 * De buttonsview wordt hier in toegevoegd.
 *
 * @author LeventHAN
 */
public class StartView extends BorderPane {
    // private Node attributen (controls)
    MenuItem miExit;

    // private Node attributen (controls)
    public StartView() {
        this.initialiseNodes();
        this.layoutNodes();
    }


    private void initialiseNodes() {
        // Initialisatie van de Nodes
        // bvb.:
        // button = new Button("...")
        // label = new Label("...")
        //menu
        miExit = new MenuItem("Exit");

    }

    private void layoutNodes() {
        // Layout van de Nodes
        // add… methodes (of set…)
        // Insets, padding, alignment, …
        Menu menuGame = new Menu("General", null, miExit);
        MenuBar menuBar = new MenuBar(menuGame);
        setTop(menuBar);
    }

    // implementatie van de nodige
    // package-private Getters
    public MenuItem getMiExit() {
        return miExit;
    }

}