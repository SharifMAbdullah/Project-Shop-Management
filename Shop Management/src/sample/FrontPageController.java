package sample;
//import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrontPageController {
    @FXML
    private Button visitFood;
    @FXML
    private Button visitGrocery;
    @FXML
    private Button visitClean;

    public void Visit(){
        ActionListener visitButtons = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) throws IOException{
                if(e.getSource() == visitFood)
                {
                    //.load(getClass().getResource("/sample/FoodPageController.fxml"));
                    Parent FoodPageController = FXMLLoader.load(getClass().getResource("/sample/FoodPageController.fxml"));
                    Scene FoodPageScene = new Scene(FoodPageController);
                    Stage FoodPageStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    FoodPageStage.setTitle("Shop Management");
                    FoodPageStage.setScene(FoodPageScene);
                    FoodPageStage.show();
                }
                else if(e.getSource() == visitGrocery)
                {
                    Parent FrontPageController = FXMLLoader.load(getClass().getResource("/sample/FrontPageController.fxml"));
                    Scene FrontPageScene = new Scene(FrontPageController);
                    Stage FrontPageStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    FrontPageStage.setTitle("Shop Management");
                    FrontPageStage.setScene(FrontPageScene);
                    FrontPageStage.show();
                }

                else if(e.getSource() == visitClean)
                {
                    Parent FrontPageController = FXMLLoader.load(getClass().getResource("/sample/FrontPageController.fxml"));
                    Scene FrontPageScene = new Scene(FrontPageController);
                    Stage FrontPageStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    FrontPageStage.setTitle("Shop Management");
                    FrontPageStage.setScene(FrontPageScene);
                    FrontPageStage.show();
                }
            }
        }
    }

}
