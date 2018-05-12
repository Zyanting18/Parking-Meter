package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PaymentSelectionController implements Initializable{

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	public void cancel(ActionEvent event) throws IOException{
		Parent Root=FXMLLoader.load(getClass().getResource("InitialPage.fxml"));
		Scene newscene=new Scene(Root);
		Stage newWindow=new Stage();
		newWindow.setTitle("Parking Meter");
		newWindow.setScene(newscene);
		newWindow.show();
		((Node)event.getSource()).getScene().getWindow().hide();
	}
	
	public void debit(ActionEvent event) throws IOException{
		Parent Root=FXMLLoader.load(getClass().getResource("DebitPay.fxml"));
		Scene newscene=new Scene(Root);
		Stage newWindow=new Stage();
		newWindow.setTitle("Pay Using Debit");
		newWindow.setScene(newscene);
		newWindow.show();
		((Node)event.getSource()).getScene().getWindow().hide();
	}
	
	public void coin(ActionEvent event) throws IOException{
		Parent Root=FXMLLoader.load(getClass().getResource("CoinPay.fxml"));
		Scene newscene=new Scene(Root);
		Stage newWindow=new Stage();
		newWindow.setTitle("Pay Coins");
		newWindow.setScene(newscene);
		newWindow.show();
		((Node)event.getSource()).getScene().getWindow().hide();
	}
	
	public void credit(ActionEvent event) throws IOException{
		Parent Root=FXMLLoader.load(getClass().getResource("CreditPay.fxml"));
		Scene newscene=new Scene(Root);
		Stage newWindow=new Stage();
		newWindow.setTitle("Pay using Credit");
		newWindow.setScene(newscene);
		newWindow.show();
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	public void goToDuration(ActionEvent event) throws IOException{
		Parent Root=FXMLLoader.load(getClass().getResource("EnterDuration.fxml"));
		Scene newscene=new Scene(Root);
		Stage newWindow=new Stage();
		newWindow.setTitle("Enter Duration");
		newWindow.setScene(newscene);
		newWindow.show();
		((Node)event.getSource()).getScene().getWindow().hide();
	}
	

	
	
}
