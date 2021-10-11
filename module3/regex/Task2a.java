package by.epam.module3.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2a {
	public static void main(String[] args) {
		String str = "<notes > \r\n" +
		         "   <note id = \"1\"> \r\n" +
		         "       <to>Вася</to> \r\n" +
		         "       <from>Света</from> \r\n" +
		         "       <heading>Напоминание</heading> \r\n" +
		         "       <body>Позвони мне завтра!</body> \r\n" +
		         "   </note> \r\n" +
		         "   <note id = \"2\"> \r\n" +
		         "       <to>Петя</to> \r\n" +
		         "       <from>Маша</from> \r\n" +
		         "       <heading>Важное напоминание</heading> \r\n" +
		         "       <body/> \r\n" +
		         "   </note> \r\n" +
		         "</notes> \r\n";

		 countTag(str);
		}

		public static void countTag(String str) {

		 String regex = "(<[^\\/].*?[^\\/]?>(?<contentTeg>[\\r\\n]?.+?[\\r\\n]?)<\\/.*?>)|(?<noBodyTag><.*?\\/>)|(?<openTeg><[A-Za-z]+.*?>)|(?<closeTeg><\\/.*?[^\\/]>)";

		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(str);

		 while (matcher.find()) {

		     System.out.println(matcher.group());

		 }
	}

}
