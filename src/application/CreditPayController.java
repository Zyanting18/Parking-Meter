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

public class CreditPayController implements Initializable{

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
	

	public void goToPaymentSelection(ActionEvent event) throws IOException{
		Parent Root=FXMLLoader.load(getClass().getResource("PaymentSelection.fxml"));
		Scene newscene=new Scene(Root);
		Stage newWindow=new Stage();
		newWindow.setTitle("Select Payment");
		newWindow.setScene(newscene);
		newWindow.show();
		((Node)event.getSource()).getScene().getWindow().hide();
	}
	
	public void Confirm(ActionEvent event) throws IOException{
		Parent Root=FXMLLoader.load(getClass().getResource("ConfirmPage.fxml"));
		Scene newscene=new Scene(Root);
		Stage newWindow=new Stage();
		newWindow.setTitle("Payment Confirmed");
		newWindow.setScene(newscene);
		newWindow.show();
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	
	
}
