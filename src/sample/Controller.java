package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
    Float data = 0f;
    int oper = -1;
    @FXML
    public Button btn1;
    @FXML
    public Button btn2;
    @FXML
    public Button btn3;
    @FXML
    public Button btn4;
    @FXML
    public Button btn5;
    @FXML
    public Button btn6;
    @FXML
    public Button btnR;
    @FXML
    public Button btn7;
    @FXML
    public Button btn8;
    @FXML
    public Button btn9;
    @FXML
    public Button btnP;
    @FXML
    public Button btn0;
    @FXML
    public Button btnDL;
    @FXML
    public Button btnRes;
    @FXML
    public Button btnD;
    @FXML
    public TextField textField;
    @FXML
    public Button btnS;

    public void btnOneClickAction(ActionEvent actionEvent) {

        if (actionEvent.getSource() == btn1) {
            textField.setText(textField.getText() +"1");
        }
        if (actionEvent.getSource() == btn2) {
            textField.setText(textField.getText() +"2");
        }
        if (actionEvent.getSource() == btn3) {
            textField.setText(textField.getText() +"3");
        }
        if (actionEvent.getSource() == btn4) {
            textField.setText(textField.getText() +"4");
        }
        if (actionEvent.getSource() == btn5) {
            textField.setText(textField.getText() +"5");
        }
        if (actionEvent.getSource() == btn6) {
            textField.setText(textField.getText() +"6");
        }
        if (actionEvent.getSource() == btn7) {
            textField.setText(textField.getText() +"7");
        }
        if (actionEvent.getSource() == btn8) {
            textField.setText(textField.getText() +"8");
        }
        if (actionEvent.getSource() == btn9) {
            textField.setText(textField.getText() +"9");
        }
        if (actionEvent.getSource() == btnS) {
            data = Float.parseFloat(textField.getText());
            oper = 1;
            textField.setText("");
        }
        if (actionEvent.getSource() == btnR) {
            data = Float.parseFloat(textField.getText());
            oper = 2;
            textField.setText("");
        }
        if (actionEvent.getSource() == btnP) {
            data = Float.parseFloat(textField.getText());
            oper = 3;
            textField.setText("");
        }
        if (actionEvent.getSource() == btnD) {
            data = Float.parseFloat(textField.getText());
            oper = 4;
            textField.setText("");
        }
        if (actionEvent.getSource() == btnDL) {
            textField.setText(" ");
        }
        if (actionEvent.getSource() == btnRes) {
            Float result = Float.parseFloat(textField.getText());
            switch (oper){
                case 1:
                    Float otv = data + result;
                    textField.setText(String.valueOf(otv));
                    break;
                case 2:
                     otv = data - result;
                    textField.setText(String.valueOf(otv));
                    break;
                case 3:
                    otv = data * result;
                    textField.setText(String.valueOf(otv));
                    break;
                case 4:
                     otv = data / result;
                    textField.setText(String.valueOf(otv));
                    break;
            }

        }


    }

}

