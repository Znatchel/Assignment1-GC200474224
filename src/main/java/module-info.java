module com.example.assignment1gc200474224 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.assignment1gc200474224 to javafx.fxml;
    exports com.example.assignment1gc200474224;
}