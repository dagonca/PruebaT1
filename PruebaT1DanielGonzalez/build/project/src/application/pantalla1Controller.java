package application;


import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class pantalla1Controller {
	private AnchorPane root;
	private Stage stage;
	
	@FXML
	private void cambio() {
		System.out.print("CLICKED!");
		try{
			
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/pantalla2.fxml"));
            root = (AnchorPane) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setResizable(false);
            stage.setTitle("Information");
            stage.setScene(new Scene(root));  
            stage.show();
          }catch(IOException e){
        	  
          }

		
	}
	

	    

}
