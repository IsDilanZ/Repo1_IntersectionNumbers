module com.example.repo1_intersectionnumbers {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.repo1_intersectionnumbers to javafx.fxml;
    exports com.example.repo1_intersectionnumbers;
}