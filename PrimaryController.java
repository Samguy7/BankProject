package com.mycompany.mavenproject4;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Label lblMsgError;
    @FXML
    private Button primaryButton;
    @FXML
    private TextField LoginField;
    @FXML
    private PasswordField PasswordField;

    @FXML
    private void Login() throws IOException, InterruptedException {
        if (LoginField.getText().equals("Sam") && PasswordField.getText().equals("1234")) {
            
            lblMsgError.setText("Login Successful");
            App.setRoot("secondary");
        } else {
            lblMsgError.setText("Username or Password is incorrect");
        }
        
    }
}
