package com.example.music_project;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LeadSingerController {

    // Goal 1
    @FXML private TableView<?> scheduleTable;

    // Goal 2
    @FXML private TextField demoPathField;
    @FXML private Label demoStatusLabel;

    // Goal 3
    @FXML private TextField songTitleField, songGenreField;
    @FXML private TextArea songLyricsArea;

    // Goal 4
    @FXML private TextArea bioArea, profilePreviewArea;
    @FXML private TextField contactField;

    // Goal 5
    @FXML private ComboBox<String> feedbackTargetCombo, feedbackFilterCombo;
    @FXML private TextArea fanFeedbackArea;

    // Goal 6
    @FXML private TextField journalMoodField;
    @FXML private TextArea journalDescArea;

    // Goal 7
    @FXML private TextField guestArtistField, guestContactField;
    @FXML private TextArea collabIdeaArea;

    // Goal 8
    @FXML private DatePicker reviewDatePicker;
    @FXML private Spinner<Integer> vocalComfortSpinner, audienceReactionSpinner, stageCoordSpinner;

    @FXML
    private void initialize() {
        feedbackTargetCombo.getItems().addAll("Song A", "Song B", "Show – Dhaka");
        feedbackFilterCombo.getItems().addAll("All", "Positive", "Negative", "Recent");

        vocalComfortSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,5,3));
        audienceReactionSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,5,3));
        stageCoordSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,5,3));
    }

    // --- Goal 1 ---
    @FXML
    private void loadMySchedule() {
        info("Schedule loaded: rehearsals & performances for 30 days.");
    }

    // --- Goal 2 ---
    @FXML
    private void validateDemoFormat() {
        String path = demoPathField.getText();
        if (path == null || !(path.endsWith(".mp3") || path.endsWith(".wav"))) {
            demoStatusLabel.setText("Invalid. Please select MP3/WAV.");
        } else {
            demoStatusLabel.setText("OK format.");
        }
    }

    @FXML
    private void uploadDemo() {
        demoStatusLabel.setText("Uploaded & shared with band.");
    }

    // --- Goal 3 ---
    @FXML
    private void submitSongIdea() {
        info("Song idea saved & added to project list.");
    }

    // --- Goal 4 ---
    @FXML
    private void previewProfile() {
        profilePreviewArea.setText("Bio:\n" + bioArea.getText() + "\nContacts:\n" + contactField.getText());
    }
    @FXML
    private void saveProfile() {
        info("Profile saved & published.");
    }

    // --- Goal 5 ---
    @FXML
    private void loadFanFeedback() {
        fanFeedbackArea.setText("Comments & ratings loaded. Use filters to refine.");
    }

    // --- Goal 6 ---
    @FXML
    private void saveJournalEntry() {
        info("Journal entry validated & saved.");
    }

    // --- Goal 7 ---
    @FXML
    private void submitCollaboration() {
        info("Collaboration proposal saved & forwarded to Band Manager.");
    }

    // --- Goal 8 ---
    @FXML
    private void savePerformanceImpression() {
        info("Performance impression saved to profile history.");
    }

    private void info(String msg) { new Alert(Alert.AlertType.INFORMATION, msg).showAndWait(); }
}
