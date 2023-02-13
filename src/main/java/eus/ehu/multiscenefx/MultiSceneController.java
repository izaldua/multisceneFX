    package eus.ehu.multiscenefx;

    import java.net.URL;
    import java.util.ResourceBundle;
    import javafx.event.ActionEvent;
    import javafx.fxml.FXML;
    import javafx.scene.control.PasswordField;
    import javafx.scene.control.TextField;

    public class MultiSceneController {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private PasswordField passwordField;

        @FXML
        private TextField userField;
        private MultiSceneApplication multiSceneApplication;

        @FXML
        void loginAction(ActionEvent event) {
            String user = userField.getText();
            String password = passwordField.getText();
            System.out.println("User: " + user);
            System.out.println("Password: " + password);

            if (user.equals("admin") && password.equals("admin")) {
                System.out.println("Login correcto");

                multiSceneApplication.changeScene("main-menu.fxml");
            } else {
                System.out.println("Login incorrecto");
            }

        }

        @FXML
        void initialize() {

        }

        public void setMultiSceneApplication(MultiSceneApplication multiSceneApplication) {
            this.multiSceneApplication = multiSceneApplication;
        }
    }
