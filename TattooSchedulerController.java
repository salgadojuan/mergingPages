package com.example.mergingpages;

//This will be considered the main controller:

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.Stack;

public class TattooSchedulerController {

    @FXML
    private TextField userNameTextField;

    @FXML
    private TextField userPasswordTextField;

    @FXML
    private TextField userLoginResult;

    @FXML
    private Button loginButton;

    @FXML
    private VBox mainV;

    public static Stack<String> menuHistory = new Stack<>();


    @FXML
    public void login() {
        String email = userNameTextField.getText();
        String password = userPasswordTextField.getText();

        if (authenticate(email, password)) {
            userLoginResult.setText("Login Successful");
            try {
                loadFXML("User_Information_Screen.fxml");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            userLoginResult.setText("Login Failed");
        }
    }


    private boolean authenticate(String email, String password) {
        String[] clientEmails = {
                "Juan",
                "Christian",

        };

        String[] clientPasswords = {
                "****",
                "****",

        };

        for (int i = 0; i < clientEmails.length; i++) {
            if (email.equals(clientEmails[i]) && password.equals(clientPasswords[i])) {
                return true;
            }
        }
        return false;
    }

    public void loadFXML(String fxmlFile) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
        Parent root = fxmlLoader.load();
        mainV.getChildren().setAll(root);
    }

}