package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private Label lblStatus;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtPass;

    public void login(ActionEvent event) throws IOException {
        if(txtUserName.getText().equals("User") && txtPass.getText().equals("1234"))
        {
            lblStatus.setText("Login Successful!");
            Parent root = FXMLLoader.load(getClass().getResource("/sample/Main.fxml"));
            Stage primaryStage = new Stage();
            primaryStage.setTitle("Shop Management");
            primaryStage.setScene(new Scene(root, 600, 600));
            primaryStage.show();
        }
        else lblStatus.setText("Login Failed!");
    }
}
