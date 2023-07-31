package ezen.oop.api;

import java.util.Scanner;

/**
 * String 클래스의 주요 메소드
 * @author 임지연
 *
 */
public class StringExample2 {

	public static void main(String[] args) {
		String ssn = "1231231231231";
		if(ssn.length()==13) {
			System.out.println("13자리 입력했습니다.");
		} else {
			System.out.println("13자리가 아닙니다.");
		}
		
		String title = "자바 프로그래밍";
		System.out.println(title.substring(3));
		System.out.println(title.substring(3, 5)); // 마지막+1 까지 해야대넹..
		System.out.println(title.replace("자바", "Java"));
		System.out.println("                     헐                              ".trim());
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("주민번호 : ");
//		ssn=scanner.nextLine();
//		
//		char c = ssn.charAt(6);
//		switch (c) {
//			case '1': System.out.println("2000년 이전 출생 남자");
//				break;
//			case '2': System.out.println("2000년 이전 출생 여자");
//				break;
//			case '3': System.out.println("2000년 이후 출생 남자");
//				break;
//			case '4': System.out.println("2000년 이후 출생 여자");
//				break;
//			default: System.out.println("외국인");
//		}
		
		if (title.indexOf("자바")!=-1) {
			System.out.println("욕하지마!");
		}
		
		int number = 434343;
		String n = String.valueOf(number); // 형변환
		System.out.println(n.length());

	}

}
