package com.mycompany.mavenproject4;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class SecondaryController {

    @FXML
    private Label CustomerName1;
    @FXML
    private Button Logout1;
    @FXML
    private Label AccountBalance1;
    @FXML
    private Button ViewAccount1;
    @FXML
    private Button ViewRouting1;
    @FXML
    private Button DebitCard1;
    @FXML
    private Button CreditCard1;
    @FXML
    private Label Transactions2;
    @FXML
    private GridPane gridPay;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void showAccountNumber(ActionEvent event) throws IOException {
        App.setRoot("secondary_1");
    }

    @FXML
    private void showRoutingNumber() throws IOException {
        App.setRoot("secondary_2");
    }


    @FXML
    private void showCustomerName(MouseEvent event) {
        CustomerName1.setText("Samuel");
    }

    @FXML
    private void switchToDebitCard(ActionEvent event) throws IOException {
        App.setRoot("secondary_3");
    }

    @FXML
    private void switchToCreditCard(ActionEvent event) throws IOException {
        App.setRoot("secondary_4");
    }

}
