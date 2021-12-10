package com.example.graphics;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GraphicsViewController {



    @FXML
    public TextField textfield1;
    @FXML
    public TextField textfield2;
    @FXML
    public Button calculbutton;
    @FXML
    public Label circumferenceresult;
    @FXML
    public Label arearesult;

    Rectangle rectangle = new Rectangle(0,0,Double.parseDouble(String.valueOf(textfield1.getText())),Double.parseDouble(String.valueOf(textfield2.getText())));

@FXML
    public void makecalculation(){
    circumferenceresult.setText(String.valueOf(rectangle.computeCirumference()));
    arearesult.setText(String.valueOf(rectangle.computeArea()));
}

}
