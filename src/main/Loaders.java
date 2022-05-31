package main;

import javafx.fxml.FXMLLoader;

public enum Loaders {
	MAIN_LOADER("/fxml/app.fxml"),
	FRONT_BOOK_LOADER("/fxml/front-book.fxml"),
	OPEN_BOOK_ONE_LOADER("/fxml/content/open-book-1.fxml"),
	OPEN_BOOK_TWO_LOADER("/fxml/content/open-book-2.fxml");
	
	// constuctor
	private Loaders(String path) {
		loader = new FXMLLoader(getClass().getResource(path) );
	}
	
	private FXMLLoader loader;
	
	public FXMLLoader getLoader() {
		return loader;
	}
}