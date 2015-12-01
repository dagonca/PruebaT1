package application;
	
import java.io.IOException;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
/**
 * 
 * @author dax01_92
 * @version 1.0
 * @category examen T1 Interfaces Graficas 2ºDAM
 * @description Interfaz grafica de una aplicacion que enviara tu perfil de GitHub a cualquier persona a traves 
 * de una segunda pantalla donde introduciras el nombre, mail y un mensaje personalizado.
 *
 */

public class Main extends Application {
	AnchorPane root;
	@Override
    public void start(Stage stage) {

		initRootLayout(stage);
		stage.setTitle("My GitHub Profile");
    }

    
    public void initRootLayout(Stage stage) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../view/pantalla1.fxml"));
            root = (AnchorPane) loader.load();
            

            // Show the scene containing the root layout.
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
    	
  
    public static void main(String[] args) {
        launch(args);
    }
}