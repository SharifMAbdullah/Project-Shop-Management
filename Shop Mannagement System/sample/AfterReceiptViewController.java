package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;


public class AfterReceiptViewController implements Initializable{
    @FXML
    private ListView<String> myListView;

    @FXML
    private Label priceLabel;

    @FXML
    private ObservableList<String> itemList;

    private double price = 0;
    public void initialize(URL arg0, ResourceBundle arg1){
	itemList = FXCollections.observableArrayList();
	for(int index=0; index<Database.numberOfProducts; index++){
	    if(Database.list.get(index).amount!=0){
		itemList.add(Database.generateString(index));
		price+=(Database.list.get(index).price * Database.list.get(index)
		    .amount);	    }
	}

	myListView.setItems(itemList);
	priceLabel.setText("Total Price: "+ Double.toString(price)+" Tk");
    }
    public void goHome(ActionEvent event) throws Exception{
	Parent root = FXMLLoader.load(getClass().getResource("/sample/Login.fxml"));
	//Scene scene = new Scene(root,800,600);
	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	stage.setTitle("Shop Management");
	//stage.setHeight(600);
	//stage.setWidth(600);
	//stage.setScene(scene);
	stage.setScene(new Scene(root,800,600));
	stage.show();

	Database.closeSession();
    }

}
