package by.jonline.oop.file.main;

import by.jonline.oop.file.entity.*;


public class Main {

	public static void main(String[] args) {
		Directory dir = new Directory();
		TextFile tf = new TextFile("New Text", dir, "In case you don't get it, put it down.");
		
		tf.add(" It helps a lot.");
		tf.view();
		
		tf.deleteFile();
		tf.view();
		
		tf.add("Your memory pills don't work.");
		tf.view();
	}

}
