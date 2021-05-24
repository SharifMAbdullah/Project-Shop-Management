package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


public class Food {
    @FXML
    private Button home;
    @FXML
    private Button[] btns = new Button[30];
    @FXML
    private TextField[] txt = new TextField[30];
    @FXML
    private int counts[] = {0};
    @FXML
    AnchorPane anchorPane;

    public void NewAction2(ActionEvent event) throws IOException {
        if (event.getSource() == home) {
            Parent FrontPageController3 = FXMLLoader.load(getClass().getResource("/sample/FrontPageController.fxml"));
            Scene FrontPageScene3 = new Scene(FrontPageController3);
            Stage FrontPageStage3 = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FrontPageStage3.setTitle("Shop Management");
            FrontPageStage3.setScene(FrontPageScene3);
            FrontPageStage3.show();
        }
    }

    /*private Pane getAnchor() {
        int i = 0;
        for (Button b : btns) {
            // do something with your button
            // maybe add an EventListener or something
            anchorPane.add(b, i * (i + (int) b.getWidth()), 0);
            i++;
        }
        return anchorPane;
    }*/

    private void initBtnsArray() {
        for (int i = 0; i < btns.length; i++) {
            btns[i] = new Button("Button-" + i);
        }
    }

        public void btnACtion(ActionEvent e) {
        int i = 0;
        for (Button b : btns) {
            // do something with your button
            // maybe add an EventListener or something
            if (e.getSource() == btns[i])
            {
                counts[i]++;
                String s = counts.toString();
                txt[i].setText(s);
            }
            i++;
        }
    }
}
