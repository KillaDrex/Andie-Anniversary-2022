package main;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class App extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// create scene
		Parent root = Loaders.MAIN_LOADER.getLoader().load();
		Scene scene = new Scene(root);
		
		// modify stage
		primaryStage.setResizable(false);
		primaryStage.setTitle("Photo Album 2022");
		primaryStage.getIcons().add(new Image("icon.png"));
		
		// set scene
		primaryStage.setScene(scene);

		// center stage (window)
		centerStage(primaryStage, 550, 650);
		
		// show stage
		primaryStage.show();
	}
	
	static void centerStage(Stage primaryStage, int rootWidth, int rootHeight) {
		Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
		primaryStage.setX((screenBounds.getWidth() - rootWidth) / 2);
		primaryStage.setY((screenBounds.getHeight() - rootHeight) / 2);
	}
}