package com.mycompany.mavenproject4;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SecondaryController_4 {

    @FXML
    private Button Logout1;
    @FXML
    private Button CreditCard;
    @FXML
    private Button ViewAccount11;
    @FXML
    private Button ViewAccount111;
    @FXML
    private Label lblOutput;
    @FXML
    private Button ViewAccount112;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    private void switchToAccountNumber() throws IOException {
        App.setRoot("secondary_1");
    }

    @FXML
    private void switchToDebitCard(ActionEvent event) throws IOException {
        App.setRoot("secondary_3");
    }

    @FXML
    private void cardStatusOn(ActionEvent event) {
        lblOutput.setText("Card is on");
    }

    @FXML
    private void cardStatusOff(ActionEvent event) {
        lblOutput.setText("Card is off");
    }

    @FXML
    private void ReportCard(ActionEvent event) {
        lblOutput.setText("A new card will be issued.");
    }
}
