package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import main.model.MainModel;
import main.view.start.StartView;
import main.view.start.StartPresenter;


/**
 * Opstartklasse van de applicatie.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        StartView view = new StartView();
        Scene scene = new Scene(view);
        MainModel model = new MainModel();
        StartPresenter presenter = new StartPresenter(model, view);
        primaryStage.setTitle("Boilerplate MVP JavaFX");
        primaryStage.getIcons().add(new Image(("images/logo/logo.png")));
        primaryStage.setResizable(true);
        primaryStage.setWidth(1020);
        primaryStage.setHeight(730);
        primaryStage.setScene(scene);
        presenter.addWindowEventHandlers();
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
