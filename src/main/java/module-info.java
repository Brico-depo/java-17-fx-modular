module com.example.graphics {
    requires javafx.controls;
    requires javafx.fxml;


    /*  opens com.example.java17fxmodular to javafx.fxml;
    opens com.example.calculator to javafx.graphics, javafx.fxml;
    opens com.example.bicycle to javafx.graphics, javafx.fxml;

     */
    opens com.example.graphics to javafx.graphics, javafx.fxml;
    exports com.example.graphics;
}
