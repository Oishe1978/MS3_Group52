package com.example.music_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        var url = HelloApplication.class.getResource("/com/example/music_project/hello-view.fxml");
        if (url == null) throw new IllegalStateException("FXML not found on classpath");
        var root = FXMLLoader.load(url);
        var scene = new Scene((Parent) root, 700, 550); // your requested size
        stage.setTitle("Band Platform");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) { launch(); }
}
