package by.epam.module3.regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

	public static void main(String[] args) {
		String xml = readFile("NewFile.xml");

		getTags(xml);

	}

	private static void getTags(String xml) {

		String strPatternAllTags = "<[^<]+>";
		Pattern pattern = Pattern.compile(strPatternAllTags, Pattern.MULTILINE);
		Matcher matcherAllTags = pattern.matcher(xml);

		String strPatternCloseTags = "</.*>";
		Pattern patternCloseTags = Pattern.compile(strPatternCloseTags, Pattern.MULTILINE);
		Matcher matcherCloseTags = patternCloseTags.matcher(xml);

		while (matcherAllTags.find()) {
			String str = matcherAllTags.group();
			System.out.println(str);

			System.out.println("Name: " + getTagName(str));
			System.out.println("Body:\n" + getTagBody(getTagName(str), xml));

		}
	}

	private static String getTagName(String string) {

		String strPattern = "[^</> ]+";

		Pattern pattern = Pattern.compile(strPattern, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(string);
		matcher.find();

		return matcher.group();
	}

	private static String getTagBody(String tagName, String text) {
		String strPattern = "(?s)<" + tagName + "[^<]*>(.*)</" + tagName + ">";

		Pattern pattern = Pattern.compile(strPattern, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(text);
		matcher.find();

		return matcher.group(1);
	}

	private static String readFile(String fileName) {

		File fileToRead = new File(fileName);

		Scanner s = null;
		try {
			s = new Scanner(fileToRead);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		StringBuilder sb = new StringBuilder();

		while (s.hasNextLine()) {

			sb.append(s.nextLine() + "\n");
		}

		return sb.toString();
	}

}
