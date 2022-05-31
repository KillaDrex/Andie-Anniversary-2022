package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
			rootPane.getChildren().add(FXMLLoader.load(getClass().getResource("/fxml/front-book.fxml") ) );
		} catch (java.io.IOException e) {}
	}
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) throws Exception {
		this.state = state;
			
		// clear root pane
		rootPane.getChildren().clear();
		
		switch (state) {
			case -1:
				rootPane.getChildren().add(FXMLLoader.load(getClass().getResource("/fxml/back-book.fxml") ) );
			break;
			case 0:
				rootPane.getChildren().add(FXMLLoader.load(getClass().getResource("/fxml/front-book.fxml") ) );
			break;
			case 1:
				rootPane.getChildren().add(FXMLLoader.load(getClass().getResource("/fxml/content/open-book-1.fxml") ) );
			break;
			case 2:
				rootPane.getChildren().add(FXMLLoader.load(getClass().getResource("/fxml/content/open-book-2.fxml") ) );
			break;
			case 3:
				rootPane.getChildren().add(FXMLLoader.load(getClass().getResource("/fxml/content/open-book-3.fxml") ) );
			break;
			case 4:
				rootPane.getChildren().add(FXMLLoader.load(getClass().getResource("/fxml/content/open-book-4.fxml") ) );
			break;	
			case 5:
				rootPane.getChildren().add(FXMLLoader.load(getClass().getResource("/fxml/content/open-book-5.fxml") ) );
			break;				
		}
		
		// fit stage to scene
		((Stage)rootPane.getScene().getWindow()).sizeToScene();		
		
		// center stage
		if (state == 0 || state == -1) {
			App.centerStage((Stage)rootPane.getScene().getWindow(), 550, 650);
		} else if (state > 0) {
			App.centerStage((Stage)rootPane.getScene().getWindow(), 1100, 650);	
		}		
	}
}