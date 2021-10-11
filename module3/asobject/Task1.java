package by.epam.module3.asobject;

//Дан текст (строка). Найти наибольшее кол-во подряд идущих пробелов

import java.util.Scanner;

public class Task1 {
	
	public static int calcNumOfSpaces(String s) {
		int space = 0;
		int num = 0;
		int index = 0;
		
		while(true) {
			index = s.indexOf(' ', index);
			if(index != -1) {
				while(index < s.length() &&s.charAt(index) == ' ') {
					num++;
					index++;
				}
				if(num > space) {
					space = num;
				}
				num = 0;
			}
			else {
				break;
			}
		}
		return space;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a line: ");
		
		String line = s.nextLine();
		
		int num = calcNumOfSpaces(line);
		System.out.println("Max of spaces: " + num);
		

	}

}
