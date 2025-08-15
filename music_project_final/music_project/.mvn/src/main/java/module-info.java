module com.example.music_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.music_project to javafx.fxml;
    exports com.example.music_project;
}