package by.jonline.oop.dragon.view;

import by.jonline.oop.dragon.view.impl.ViewImpl;

public class ViewProvider {
	
	private static final ViewProvider instance = new ViewProvider();
	
	private ViewProvider() {
	}
	
	public static ViewProvider getInstance() {
		return instance;
	}
	
	private View view = new ViewImpl();

	public View getView() {
		return view;
	}
	
	

}
