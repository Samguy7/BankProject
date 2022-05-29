package com.mycompany.mavenproject4;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SecondaryController_1 {

    @FXML
    private Button Logout1;
    @FXML
    private Label AccountBalance1;
    @FXML
    private Button ViewRouting1;
  
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
     @FXML
    private void switchToRoutingNumber() throws IOException {
        App.setRoot("secondary_2");
}
    private void switchToDebitCard() throws IOException {
        App.setRoot("secondary_3");
}
    private void switchToCreditCard() throws IOException {
        App.setRoot("secondary_4");
    }
}