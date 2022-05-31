package main;

import javafx.scene.input.MouseEvent;

public class BookController {
	public void initialize() {
	}
	
	public void handleForwardMouseClick(MouseEvent mouseEvent) throws Exception {
		MainController mainController = App.mainLoader.getController();
		
		// last page, go to back of book
		if (mainController.getState() == 5) {
			mainController.setState(-1);
			return;
		}
		
		// flip to the next page
		mainController.setState(mainController.getState() + 1);
	}
	
	public void handleBackwardMouseClick(MouseEvent mouseEvent) throws Exception {
		MainController mainController = App.mainLoader.getController();
		
		// back of book, flip to last page
		if (mainController.getState() == -1) {
			mainController.setState(5);
			return;
		}
		
		// flip to the previous page
		mainController.setState(mainController.getState() - 1); 
	}
}