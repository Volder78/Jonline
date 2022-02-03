package by.jonline.oop.dragon.view.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import by.jonline.oop.dragon.view.View;

public class ViewImpl implements View {

	@Override
	public String userChoice() {
		BufferedReader reader = null;
		String input = null;
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			
			input = reader.readLine();
			
		} catch(IOException e) {
			System.err.println(e);
			
		} finally {
			try {
				reader.close();
			} catch (IOException e) { 
				e.printStackTrace();
			}
		}
		
		return input;
	}

	@Override
	public void displayMenu() {
		System.out.println("Dragon says:");
		System.out.println("Press '1' and you'll see all my treasures");
		System.out.println("Press '2' and you'll see the most expensive one");
		System.out.println("Press '3' and you can buy something if you have a sum of money (Enter '3'<space>sum)");
		
		
	}

	@Override
	public void displayResults(String str) {
		System.out.println(str);
		
	}

}
