package by.jonline.oop.dragon.main;

import by.jonline.oop.dragon.controller.Controller;
import by.jonline.oop.dragon.view.View;
import by.jonline.oop.dragon.view.ViewProvider;

public class Main {

	public static void main(String[] args) {
		ViewProvider provider = ViewProvider.getInstance();
		View view = provider.getView();
		
		view.displayMenu();
		
		String request = view.userChoice();
		Controller controller = new Controller();
		
		view.displayResults(controller.doAction(request));

	}

}
