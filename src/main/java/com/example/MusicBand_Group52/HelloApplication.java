package com.example.MusicBand_Group52;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override

    public void start(Stage stage) throws Exception {
        var url = HelloApplication.class.getResource("/com/example/MusicBand_Group52/hello-view.fxml");
        if (url == null) throw new IllegalStateException("FXML not found on classpath");

        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root, 700, 550);

        stage.setTitle("Band Platform");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}