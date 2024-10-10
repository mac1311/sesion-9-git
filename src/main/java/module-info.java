module com.example.sesion9github {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sesion9github to javafx.fxml;
    exports com.example.sesion9github;
}