package com.example.MusicBand_Group52;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class StageDirectorController {

    // Buttons
    @FXML private Button btnStageLayout;
    @FXML private Button btnMovementPlan;
    @FXML private Button btnPropTeam;
    @FXML private Button btnRehearsalSchedule;
    @FXML private Button btnPerformanceCues;
    @FXML private Button btnLiveEmergencies;
    @FXML private Button btnPostReview;
    @FXML private Button btnMediaSetup;


    @FXML private AnchorPane goal1Pane;
    @FXML private AnchorPane goal2Pane;
    @FXML private AnchorPane goal3Pane;
    @FXML private AnchorPane goal4Pane;
    @FXML private AnchorPane goal5Pane;
    @FXML private AnchorPane goal6Pane;
    @FXML private AnchorPane goal7Pane;
    @FXML private AnchorPane goal8Pane;


    @FXML private StackPane contentPane;


    @FXML private Label lblWelcome;

    @FXML
    public void initialize() {
        // Button actions: show corresponding goal pane when clicked
        btnStageLayout.setOnAction(e -> showGoal(1));
        btnMovementPlan.setOnAction(e -> showGoal(2));
        btnPropTeam.setOnAction(e -> showGoal(3));
        btnRehearsalSchedule.setOnAction(e -> showGoal(4));
        btnPerformanceCues.setOnAction(e -> showGoal(5));
        btnLiveEmergencies.setOnAction(e -> showGoal(6));
        btnPostReview.setOnAction(e -> showGoal(7));
        btnMediaSetup.setOnAction(e -> showGoal(8));
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

        // Optionally print goal info to console
        printGoalInfo(goalNumber);
    }

    /**
     * Sample method to print goal info for debugging
     */
    private void printGoalInfo(int goalNumber) {
        switch (goalNumber) {
            case 1 -> System.out.println("Goal 1: Design Stage Layout selected.");
            case 2 -> System.out.println("Goal 2: Member Movement Plan selected.");
            case 3 -> System.out.println("Goal 3: Coordinate with Prop Team selected.");
            case 4 -> System.out.println("Goal 4: Schedule Rehearsals selected.");
            case 5 -> System.out.println("Goal 5: Align Performance Cues selected.");
            case 6 -> System.out.println("Goal 6: Handle Live Emergencies selected.");
            case 7 -> System.out.println("Goal 7: Post-Concert Review selected.");
            case 8 -> System.out.println("Goal 8: Media Shoot Stage Setup selected.");
        }
    }



    public Button getBtnStageLayout() { return btnStageLayout; }
    public Button getBtnMovementPlan() { return btnMovementPlan; }
    public Button getBtnPropTeam() { return btnPropTeam; }
    public Button getBtnRehearsalSchedule() { return btnRehearsalSchedule; }
    public Button getBtnPerformanceCues() { return btnPerformanceCues; }
    public Button getBtnLiveEmergencies() { return btnLiveEmergencies; }
    public Button getBtnPostReview() { return btnPostReview; }
    public Button getBtnMediaSetup() { return btnMediaSetup; }

    public AnchorPane getGoal1Pane() { return goal1Pane; }
    public AnchorPane getGoal2Pane() { return goal2Pane; }
    public AnchorPane getGoal3Pane() { return goal3Pane; }
    public AnchorPane getGoal4Pane() { return goal4Pane; }
    public AnchorPane getGoal5Pane() { return goal5Pane; }
    public AnchorPane getGoal6Pane() { return goal6Pane; }
    public AnchorPane getGoal7Pane() { return goal7Pane; }
    public AnchorPane getGoal8Pane() { return goal8Pane; }

    public StackPane getContentPane() { return contentPane; }
    public Label getLblWelcome() { return lblWelcome; }

    public void setBtnStageLayout(Button btnStageLayout) { this.btnStageLayout = btnStageLayout; }
    public void setBtnMovementPlan(Button btnMovementPlan) { this.btnMovementPlan = btnMovementPlan; }
    public void setBtnPropTeam(Button btnPropTeam) { this.btnPropTeam = btnPropTeam; }
    public void setBtnRehearsalSchedule(Button btnRehearsalSchedule) { this.btnRehearsalSchedule = btnRehearsalSchedule; }
    public void setBtnPerformanceCues(Button btnPerformanceCues) { this.btnPerformanceCues = btnPerformanceCues; }
    public void setBtnLiveEmergencies(Button btnLiveEmergencies) { this.btnLiveEmergencies = btnLiveEmergencies; }
    public void setBtnPostReview(Button btnPostReview) { this.btnPostReview = btnPostReview; }
    public void setBtnMediaSetup(Button btnMediaSetup) { this.btnMediaSetup = btnMediaSetup; }

    public void setGoal1Pane(AnchorPane goal1Pane) { this.goal1Pane = goal1Pane; }
    public void setGoal2Pane(AnchorPane goal2Pane) { this.goal2Pane = goal2Pane; }
    public void setGoal3Pane(AnchorPane goal3Pane) { this.goal3Pane = goal3Pane; }
    public void setGoal4Pane(AnchorPane goal4Pane) { this.goal4Pane = goal4Pane; }
    public void setGoal5Pane(AnchorPane goal5Pane) { this.goal5Pane = goal5Pane; }
    public void setGoal6Pane(AnchorPane goal6Pane) { this.goal6Pane = goal6Pane; }
    public void setGoal7Pane(AnchorPane goal7Pane) { this.goal7Pane = goal7Pane; }
    public void setGoal8Pane(AnchorPane goal8Pane) { this.goal8Pane = goal8Pane; }

    public void setContentPane(StackPane contentPane) { this.contentPane = contentPane; }
    public void setLblWelcome(Label lblWelcome) { this.lblWelcome = lblWelcome; }
}
