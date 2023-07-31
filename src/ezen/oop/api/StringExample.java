package ezen.oop.api;

public class StringExample {

	public static void main(String[] args) {
		String message1 = new String("Java Program");
		String message2 = new String("java Program");
		System.out.println(message1==message2);
		System.out.println(message1.equalsIgnoreCase(message2));
		
		String message3 = "Java Program";
		String message4 = "Java Program";
		System.out.println(message3==message4);
		System.out.println(message3.equals(message4));
		System.out.println(message1.equals(message4));
		
		char[] chars = {'J','a','v','a'};
		String str = new String(chars);
		System.out.println(str);
		

	}

}
