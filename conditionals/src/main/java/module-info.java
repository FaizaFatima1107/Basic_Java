module com.example.conditionals {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.conditionals to javafx.fxml;
    exports com.example.conditionals;
}