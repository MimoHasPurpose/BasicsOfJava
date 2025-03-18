module com.example.test {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires javafx.swt;

    opens com.example.test to javafx.fxml;
    exports com.example.test;
}