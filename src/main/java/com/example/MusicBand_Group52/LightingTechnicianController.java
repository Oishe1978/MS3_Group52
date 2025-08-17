package com.example.MusicBand_Group52;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LightingTechnicianController {


    @FXML private Button btnSetupLighting;
    @FXML private Button btnTestRehearsal;
    @FXML private Button btnBackupPlan;
    @FXML private Button btnMaintenance;
    @FXML private Button btnCueSync;
    @FXML private Button btnCueCoordination;
    @FXML private Button btnMediaShoot;
    @FXML private Button btnPostReport;


    @FXML private AnchorPane goal1Pane;
    @FXML private AnchorPane goal2Pane;
    @FXML private AnchorPane goal3Pane;
    @FXML private AnchorPane goal4Pane;
    @FXML private AnchorPane goal5Pane;
    @FXML private AnchorPane goal6Pane;
    @FXML private AnchorPane goal7Pane;
    @FXML private AnchorPane goal8Pane;

    @FXML
    public void initialize() {
        
        btnSetupLighting.setOnAction(e -> handleGoalAction(1));
        btnTestRehearsal.setOnAction(e -> handleGoalAction(2));
        btnBackupPlan.setOnAction(e -> handleGoalAction(3));
        btnMaintenance.setOnAction(e -> handleGoalAction(4));
        btnCueSync.setOnAction(e -> handleGoalAction(5));
        btnCueCoordination.setOnAction(e -> handleGoalAction(6));
        btnMediaShoot.setOnAction(e -> handleGoalAction(7));
        btnPostReport.setOnAction(e -> handleGoalAction(8));
    }

    /**
     * Central handler for button actions
     * @param goalNumber 1-8 corresponding to the goal
     */
    private void handleGoalAction(int goalNumber) {
        showGoal(goalNumber);
        printSelectedGoal(goalNumber);
    }

    /**
     * Show the selected goal pane and hide all others
     * @param goalNumber 1-8
     */
    private void showGoal(int goalNumber) {
        goal1Pane.setVisible(goalNumber == 1);
        goal2Pane.setVisible(goalNumber == 2);
        goal3Pane.setVisible(goalNumber == 3);
        goal4Pane.setVisible(goalNumber == 4);
        goal5Pane.setVisible(goalNumber == 5);
        goal6Pane.setVisible(goalNumber == 6);
        goal7Pane.setVisible(goalNumber == 7);
        goal8Pane.setVisible(goalNumber == 8);
    }

    /**
     * Print the selected goal for debug/log purposes
     */
    private void printSelectedGoal(int goalNumber) {
        System.out.println("Selected Goal: " + goalNumber);
    }

    /**
     * Scene switching method
     * Load another FXML and replace current scene
     */
    public void switchScene(Button sourceButton, String fxmlFile) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
            Stage stage = (Stage) sourceButton.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }


    public Button getBtnSetupLighting() { return btnSetupLighting; }
    public void setBtnSetupLighting(Button btnSetupLighting) { this.btnSetupLighting = btnSetupLighting; }

    public Button getBtnTestRehearsal() { return btnTestRehearsal; }
    public void setBtnTestRehearsal(Button btnTestRehearsal) { this.btnTestRehearsal = btnTestRehearsal; }

    public Button getBtnBackupPlan() { return btnBackupPlan; }
    public void setBtnBackupPlan(Button btnBackupPlan) { this.btnBackupPlan = btnBackupPlan; }

    public Button getBtnMaintenance() { return btnMaintenance; }
    public void setBtnMaintenance(Button btnMaintenance) { this.btnMaintenance = btnMaintenance; }

    public Button getBtnCueSync() { return btnCueSync; }
    public void setBtnCueSync(Button btnCueSync) { this.btnCueSync = btnCueSync; }

    public Button getBtnCueCoordination() { return btnCueCoordination; }
    public void setBtnCueCoordination(Button btnCueCoordination) { this.btnCueCoordination = btnCueCoordination; }

    public Button getBtnMediaShoot() { return btnMediaShoot; }
    public void setBtnMediaShoot(Button btnMediaShoot) { this.btnMediaShoot = btnMediaShoot; }

    public Button getBtnPostReport() { return btnPostReport; }
    public void setBtnPostReport(Button btnPostReport) { this.btnPostReport = btnPostReport; }

    public AnchorPane getGoal1Pane() { return goal1Pane; }
    public void setGoal1Pane(AnchorPane goal1Pane) { this.goal1Pane = goal1Pane; }

    public AnchorPane getGoal2Pane() { return goal2Pane; }
    public void setGoal2Pane(AnchorPane goal2Pane) { this.goal2Pane = goal2Pane; }

    public AnchorPane getGoal3Pane() { return goal3Pane; }
    public void setGoal3Pane(AnchorPane goal3Pane) { this.goal3Pane = goal3Pane; }

    public AnchorPane getGoal4Pane() { return goal4Pane; }
    public void setGoal4Pane(AnchorPane goal4Pane) { this.goal4Pane = goal4Pane; }

    public AnchorPane getGoal5Pane() { return goal5Pane; }
    public void setGoal5Pane(AnchorPane goal5Pane) { this.goal5Pane = goal5Pane; }

    public AnchorPane getGoal6Pane() { return goal6Pane; }
    public void setGoal6Pane(AnchorPane goal6Pane) { this.goal6Pane = goal6Pane; }

    public AnchorPane getGoal7Pane() { return goal7Pane; }
    public void setGoal7Pane(AnchorPane goal7Pane) { this.goal7Pane = goal7Pane; }

    public AnchorPane getGoal8Pane() { return goal8Pane; }
    public void setGoal8Pane(AnchorPane goal8Pane) { this.goal8Pane = goal8Pane; }

}

