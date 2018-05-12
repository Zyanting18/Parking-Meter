package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class InitialPageController implements Initializable{
	
	@FXML
	Button language;
	@FXML
	Button purchase;
	@FXML
	Button refund;
	@FXML
	Label label;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void switchLanguage(ActionEvent event) throws IOException{
		if(language.getText().equals("Francias")){
			language.setText("English");
			purchase.setText("acheter un ticket de parking");
			refund.setText("rembourser un ticket de parking");
			label.setText("Bienvenue");
		}else{
			language.setText("Francias");
			purchase.setText("Purchase a parking ticket");
			refund.setText("Refund a parking ticket");
			label.setText("Welcome");
		}
	}

	public void begin(ActionEvent event) throws IOException{
		showDurationPage(event);
	}
	
	public void refund(ActionEvent event) throws IOException{
		Parent Root=FXMLLoader.load(getClass().getResource("RefundPage.fxml"));
		Scene newscene=new Scene(Root);
		Stage newWindow=new Stage();
		newWindow.setTitle("Refund");
		newWindow.setScene(newscene);
		newWindow.show();
		((Node)event.getSource()).getScene().getWindow().hide();
	}

	
	//private method
	
	private void showDurationPage(ActionEvent event) throws IOException{
		Parent Root=FXMLLoader.load(getClass().getResource("EnterDuration.fxml"));
		Scene newscene=new Scene(Root);
		Stage newWindow=new Stage();
		newWindow.setTitle("Enter Duration");
		newWindow.setScene(newscene);
		newWindow.show();
		((Node)event.getSource()).getScene().getWindow().hide();
	}
	
	
}
