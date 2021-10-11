package by.epam.module3.asobject;

import java.util.Scanner;

//Вставить после каждого символа 'a' символ 'b'

public class Task2 {
	
	public static String addSymbol(String s, char input, char symbol) {
		String newString = "";
		newString += input;
		newString += symbol;
		
		String oldString = "";
		oldString += input;
		
		return s.replace(oldString, newString);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a line of text: ");
		String line = s.nextLine();
		
		char ch1 = 'a';
		char ch2 = 'b';
		
		String addedLine = addSymbol(line, ch1, ch2);
		System.out.println(addedLine);
			
	}

}
