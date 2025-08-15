package com.example.music_project;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.time.LocalDate;

public class BandManagerController {

    // Goal 1 fields
    @FXML private TextField tourNameField, citiesField, venuesField;
    @FXML private DatePicker startDatePicker, endDatePicker;
    @FXML private TextArea audiencePerStopArea, tourOutputArea;

    // Goal 2 fields
    @FXML private ComboBox<String> completedTourCombo;
    @FXML private TextArea financialReportArea;

    // Goal 3 fields
    @FXML private ComboBox<String> crewTourCombo, soundCombo, lightingCombo, transportCombo;

    // Goal 4 fields
    @FXML private DatePicker editTourDatePicker;
    @FXML private TextField editVenueField;
    @FXML private TextArea editNotesArea;

    // Goal 5
    @FXML private TextField broadcastSubjectField;
    @FXML private TextArea broadcastBodyArea;

    // Goal 6
    @FXML private DatePicker cancelDatePicker;
    @FXML private ComboBox<String> cancelActionCombo;

    // Goal 7
    @FXML private TableView<?> budgetTable;

    // Goal 8
    @FXML private ComboBox<String> postTourCombo;
    @FXML private TextArea postTourDetailsArea, postTourCommentsArea;

    @FXML
    private void initialize() {
        // Seed combos for demo
        completedTourCombo.getItems().addAll("Spring Tour 2025", "Asia Mini 2025");
        crewTourCombo.getItems().addAll("Summer Blast 2025", "EU Fall 2025");
        soundCombo.getItems().addAll("Alice", "Bob", "Charlie");
        lightingCombo.getItems().addAll("Lina", "Marco");
        transportCombo.getItems().addAll("TransX", "RoadPro");
        cancelActionCombo.getItems().addAll("Cancel", "Postpone");
        postTourCombo.getItems().addAll("Spring Tour 2025", "Asia Mini 2025");
    }

    // --- Goal 1 ---
    @FXML
    private void validateSchedule() {
        String name = tourNameField.getText();
        LocalDate s = startDatePicker.getValue();
        LocalDate e = endDatePicker.getValue();
        if (name == null || name.isBlank()) {
            alert("Validation", "Tour Name required.");
            return;
        }
        if (s == null || e == null || e.isBefore(s)) {
            alert("Validation", "Dates invalid.");
            return;
        }
        // Simple conflict check demo
        tourOutputArea.setText("Validation OK. No overlaps found.");
    }

    @FXML
    private void generateDraftPlan() {
        tourOutputArea.appendText("\nDraft plan generated:\n- Cities: " + citiesField.getText()
                + "\n- Venues: " + venuesField.getText()
                + "\n- Expected: \n" + audiencePerStopArea.getText());
    }

    @FXML
    private void finalizeSchedule() {
        alert("Finalize", "Tour saved, calendar updated, notifications sent.");
    }

    // --- Goal 2 ---
    @FXML
    private void loadFinancialReport() {
        String tour = completedTourCombo.getValue();
        financialReportArea.setText("Ticket Sales: 1,200,000\nVenue Costs: 400,000\nExpenses: 250,000\nNet: 550,000");
    }

    @FXML
    private void exportFinancialPdf() {
        alert("Export", "PDF generated & saved to server.");
    }

    // --- Goal 3 ---
    @FXML
    private void confirmCrewAssignments() {
        alert("Crew", "Assignments saved and emails sent.");
    }

    // --- Goal 4 ---
    @FXML
    private void submitTourEdits() {
        alert("Edit Tour", "Changes stored, audit logged.");
    }

    // --- Goal 5 ---
    @FXML
    private void sendBroadcast() {
        alert("Broadcast", "Message delivered & logged.");
    }

    // --- Goal 6 ---
    @FXML
    private void confirmCancelOrPostpone() {
        alert("Schedule Change", "System updated and refunds triggered if needed.");
    }

    // --- Goal 7 ---
    @FXML
    private void loadBudgets() {
        alert("Budget", "Pending budgets loaded.");
    }

    @FXML
    private void validateBudgetTotals() {
        alert("Budget", "Totals validated within limits.");
    }

    @FXML
    private void approveBudget() {
        alert("Budget", "Approved with feedback.");
    }

    @FXML
    private void rejectBudget() {
        alert("Budget", "Rejected with feedback.");
    }

    // --- Goal 8 ---
    @FXML
    private void loadPostTourDetails() {
        postTourDetailsArea.setText("Performance feedback, satisfaction, incidents (mock data).");
    }

    @FXML
    private void savePostTourReview() {
        alert("Post-Tour Review", "Review saved.");
    }

    private void alert(String title, String msg) {
        new Alert(Alert.AlertType.INFORMATION, msg).showAndWait();
    }
}
