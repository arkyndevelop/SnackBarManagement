package Controller;

import Model.User;
import Model.UserModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    @FXML
    private TextField usernameFieldLogin;

    @FXML
    private TextField passwordFieldLogin;

    @FXML
    private Button buttonLogin;

    @FXML
    private Label statusLabel;

    @FXML
    private Button buttonRegisterScreenLogin;

    private UserModel userModel;

    @FXML
    public void initialize() {
        // Inicializa o userModel
        userModel = new UserModel();
    }

    @FXML
    protected void loginButtonAction() {
        String username = usernameFieldLogin.getText();
        String password = passwordFieldLogin.getText();

        // Autentica o usuário
        User authenticatedUser = userModel.authenticate(username, password);

        if (authenticatedUser != null) {
            // Verifica o papel do usuário e redireciona para a tela correta
            if (authenticatedUser.getRole() == User.UserRole.ADMIN) {
                loadAdminScreen();
            }
            if (authenticatedUser.getRole() == User.UserRole.CLIENT) {
                // loadClientScreen();
            }
        } else {
            statusLabel.setText("Username or password incorrect");
        }
    }

    private void loadAdminScreen() {
        try {
            // Carrega a tela do admin
            Parent root = FXMLLoader.load(getClass().getResource("/View/Person/Adm/adm_home.fxml"));
            Stage stage = (Stage) usernameFieldLogin.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
            statusLabel.setText("Error: Admin screen not found."); // Mensagem de erro
        }
    }
}