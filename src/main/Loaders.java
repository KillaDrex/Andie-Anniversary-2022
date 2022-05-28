package main;

import javafx.fxml.FXMLLoader;

public enum Loaders {
	MAIN_LOADER("/fxml/app.fxml"),
	FRONT_BOOK_LOADER("/fxml/front-book.fxml"),
	OPEN_BOOK_LOADER("/fxml/open-book.fxml");
	
	// constuctor
	private Loaders(String path) {
		loader = new FXMLLoader(getClass().getResource(path) );
	}
	
	private FXMLLoader loader;
	
	public FXMLLoader getLoader() {
		return loader;
	}
}