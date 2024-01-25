package com.example.mergingpages;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class User_Information_Screen_Controller {

    @FXML
    private Button displayUsers_Button;

    @FXML
    private Button logOutButton;


    @FXML
    private Button findUser_Button;

    @FXML
    private Button return_to_mainButton;

    @FXML
    private Button schedulingModule_Button;

    @FXML
    private Button userInformationScreen_Button;

    @FXML
    private Button userInformation_ChangePassword_Button;

    @FXML
    private TextField userInformation_userName_TextField;

    // THE LOGIN PAGE WOULD BE THE MAIN SCREEN, & WE WOULD LIKE TO MERGE THE USER INFORMATION SCREEN WHEN WE LOG IN.
    // THE LOGIN CREDENTIALS ARE HARDCODED IN THE MAIN CONTROLLER.
    public void User_Information_Screen_Controller(ActionEvent ae) throws IOException {
        String scene = "Login_Screen.fxml";
        changeScene(scene);
    }

    private void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        Stage primaryStage = (Stage) userInformationScreen_Button.getScene().getWindow();
        primaryStage.getScene().setRoot(pane);
    }

    @FXML
    private void handleLogOutAction() {
        Platform.exit();


    }
}
