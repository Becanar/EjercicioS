module com.example.ejercicios {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql.rowset;


    exports com.example.ejercicios.app;
    opens com.example.ejercicios.app to javafx.fxml;
    exports com.example.ejercicios.controladores;
    opens com.example.ejercicios.controladores to javafx.fxml;
}