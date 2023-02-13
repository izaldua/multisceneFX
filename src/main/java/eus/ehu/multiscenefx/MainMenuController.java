package eus.ehu.multiscenefx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainMenuController {

    private MultiSceneApplication mainApplication;

    @FXML
    void logout(ActionEvent event) {
        System.out.println("Logout");
        mainApplication.changeScene("login.fxml");
    }

    public void setMainApplication(MultiSceneApplication mainApplication) {
        this.mainApplication = mainApplication;
    }

    @FXML
    void initialize() {

    }

}
