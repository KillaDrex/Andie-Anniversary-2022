package main;

import javafx.scene.input.MouseEvent;

public class OpenBookController {
	public void initialize() {
	}
	
	public void handleMouseClick(MouseEvent mouseEvent) {
		MainController mainController = Loaders.MAIN_LOADER.getLoader().getController();
		
		if (mainController.getState() == 0) {	// open book
			mainController.setState(1);
		}
	}
}