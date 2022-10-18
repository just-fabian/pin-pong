module com.pjfx.pingpongjfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.pjfx.pingpongjfx to javafx.fxml;
    exports com.pjfx.pingpongjfx;

    exports com.pjfx.pingpongjfx.controller;
    opens com.pjfx.pingpongjfx.controller to javafx.fxml;

     // Uncomment to use the view and model packages
//    exports com.pjfx.pingpongjfx.view;
//    opens com.pjfx.pingpongjfx.view to javafx.fxml;
//    exports com.pjfx.pingpongjfx.model;
//    opens com.pjfx.pingpongjfx.model to javafx.fxml
}