package com.mycompany.mavenproject4;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SecondaryController_2 {

    @FXML
    private Button Logout1;
    @FXML
    private Label AccountBalance1;
    @FXML
    private Button ViewAccount1;
  
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void switchToAccountNumber() throws IOException {
        App.setRoot("secondary_1");
}
}