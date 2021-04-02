package main.view.start;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.WindowEvent;
import main.Log;
import main.model.MainModel;

public class StartPresenter {
    private StartView startView;

    public StartPresenter(
            MainModel model,
            StartView startView
    ) {
        this.startView = startView;
        this.addEventHandlers();
        this.updateView();
        Log.debug("StartView is initialized.");

    }

    private void addEventHandlers() {
        // Koppelt event handlers (anon. inner klassen)
        // aan de controls uit de view.
        // Event handlers: roepen methodes aan uit het
        // model en zorgen voor een update van de view.
        addMenuEventHandlers();
    }

    private void updateView() {
        // Vult de view met data uit model
        // splash-screen
    }

    public void addWindowEventHandlers() {
        // Window event handlers (anon. inner klassen)
        // Koppeling via view.getScene().getWindow()
        startView.getScene().getWindow().setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setHeaderText("Are you sure?");
                alert.setContentText("Are you sure you want to close the application?");
                alert.setTitle("Warning!");
                alert.getButtonTypes().clear();
                ButtonType no = new ButtonType("No");
                ButtonType yes = new ButtonType("Yes");
                alert.getButtonTypes().addAll(no, yes);
                alert.showAndWait();
                if (alert.getResult().equals(no)) {
                    event.consume();
                }
            }
        });
    }

    private void addMenuEventHandlers() {
        startView.getMiExit().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setHeaderText("Are you sure?");
                alert.setContentText("Are you sure you want to close the application?");
                alert.setTitle("Warning!");
                alert.getButtonTypes().clear();
                ButtonType no = new ButtonType("No");
                ButtonType yes = new ButtonType("Yes");
                alert.getButtonTypes().addAll(no, yes);
                alert.showAndWait();
                if (alert.getResult().equals(no)) {
                    event.consume();
                } else {
                    Platform.exit();
                }
            }
        });
    }

}
