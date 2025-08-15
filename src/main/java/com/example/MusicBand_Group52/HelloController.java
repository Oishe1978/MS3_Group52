package com.example.MusicBand_Group52;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button btnLightingTech;

    @FXML
    private Button btnStageDirector;


    @FXML
    private Label welcomeText;

    @FXML
    private void onHelloButtonClick() {
        welcomeText.setText("Hello, Music Band Group 52!");
        System.out.println("Hello button clicked!");
    }
    @FXML
    public void initialize() {
        // Initialize button actions
        btnLightingTech.setOnAction(this::openLightingTechnicianView);
        btnStageDirector.setOnAction(this::openStageDirectorView);
    }

    private void openLightingTechnicianView(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/MusicBand_Group52/LightingTechnicianView.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root, 900, 700));
            stage.setTitle("Lighting Technician Panel");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void openStageDirectorView(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/MusicBand_Group52/StageDirectorView.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root, 900, 700));
            stage.setTitle("Stage Director Panel");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Optional: getters and setters for buttons
    public Button getBtnLightingTech() { return btnLightingTech; }
    public void setBtnLightingTech(Button btnLightingTech) { this.btnLightingTech = btnLightingTech; }

    public Button getBtnStageDirector() { return btnStageDirector; }
    public void setBtnStageDirector(Button btnStageDirector) { this.btnStageDirector = btnStageDirector; }
}
