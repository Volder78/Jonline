package by.epam.module3.asobject;

//Из заданной строки получить новую, повторив каждый символ дважды

public class Task6 {
	
	public static String repeat(String s) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++) {
			sb.append(String.valueOf(s.charAt(i)).repeat(2));
			
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String line = "Learning java is awesome";
		line = line.toUpperCase();
		System.out.println("Initial line is: "+ "'" + line + "'");
		
		String line1 = repeat(line);
		line1 = line1.toUpperCase();
		System.out.println("Line after change is: " + "'" + line1 + "'");
	

	}

}
