package main;

import javafx.fxml.FXML;
import javafx.geometry.Rectangle2D;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainController {
	private int state; // capture program state
	
	@FXML private Pane rootPane;
	
	public void initialize() {
		// initialize program state
		state = 0;
		try {
			rootPane.getChildren().add(Loaders.FRONT_BOOK_LOADER.getLoader().load() );
		} catch (java.io.IOException e) {}
	}
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		
		if (state == 1) {	// open book
			rootPane.getChildren().clear();
			try {
				rootPane.getChildren().add(Loaders.OPEN_BOOK_LOADER.getLoader().load() );
			} catch (java.io.IOException e) {}
			
			// fit stage to scene
			((Stage)rootPane.getScene().getWindow()).sizeToScene();
			
			// center stage
			App.centerStage((Stage)rootPane.getScene().getWindow(), 1100, 650);
		}
	}
}