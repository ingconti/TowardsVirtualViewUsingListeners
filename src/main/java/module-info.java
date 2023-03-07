module com.example.towardsvirtualviewusinglisteners {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.towardsvirtualviewusinglisteners to javafx.fxml;
    exports com.example.towardsvirtualviewusinglisteners;
}