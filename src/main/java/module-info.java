module bmt.taskmanageravanzato {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens bmt.taskmanageravanzato to javafx.fxml;
    exports bmt.taskmanageravanzato;
    exports bmt.taskmanageravanzato.Controller;
    opens bmt.taskmanageravanzato.Controller to javafx.fxml;
    exports bmt.taskmanageravanzato.model;
    opens bmt.taskmanageravanzato.model to javafx.fxml;
}