package ca.georgian.comp1101m2022ice2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculateVector2DDistanceController {

    @FXML
    private TextField ResultTextField;

    @FXML
    private TextField X1TextField;

    @FXML
    private TextField X2TextField;

    @FXML
    private TextField Y1TextField;

    @FXML
    private TextField Y2TextField;

    @FXML
    void OnCalculateButtonClicked(ActionEvent event)
    {
        // Setup Variables
        try
        {

        }
        catch (Exception e) {
            ResultTextField.setText("Please Enter Valid Numbers");
        }
    }

    @FXML
    void OnResetButtonClicked(ActionEvent event)
    {
        X1TextField.clear();
        Y1TextField.clear();
        X2TextField.clear();
        Y2TextField.clear();
        ResultTextField.clear();

        X1TextField.requestFocus();
    }

}