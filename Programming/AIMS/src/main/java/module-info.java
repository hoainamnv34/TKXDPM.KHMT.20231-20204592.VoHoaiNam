module com.example.aims {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.aims.view to javafx.fxml;
    exports com.example.aims.view;

}