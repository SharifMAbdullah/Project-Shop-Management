package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ReceiptController {
@FXML
private Label lbl;
public static void  initialize(){
    double x=10,y=10;
    for(int i = 0;i<Database.list.size(); i++)
        {
        if(Database.list.get(i).amount !=0)
            {
            Label newLabel = new Label();
            String s = new String();
            s = "Product name: " + (Database.list.get(i).name) + "Product quantity: " +Integer.toString(Database.list.get(i).amount) + "Product price: "+Double.toString(Database.list.get(i).price);
            newLabel.setText(s);
            y += 10;
            newLabel.setLayoutX(x);
            newLabel.setLayoutY(y);
            }
        }

    }
}
