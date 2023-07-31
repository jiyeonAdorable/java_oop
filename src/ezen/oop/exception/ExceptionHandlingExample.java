package ezen.oop.exception;

import java.io.IOException;
import java.util.Scanner;

/**
 * 개발자가 예외 처리하는 방법
 * try ~ catch 블록 사용
 * @author 임지연
 *
 */
public class ExceptionHandlingExample {
	
	public static void exceptionHandling1() {
		try {
			// 예외가 발생할 가능성이 있는 실행문
			int x = 10, y= 0;
			System.out.println(x/y);
			
			String name = null;
			System.out.println(name.length());
			
		} catch(ArithmeticException ex) { // catch 안에 예외 클래스
			// 개발자가 예외 처리하는 코드
			System.err.println(ex.getMessage()); //err 색이 다름
			ex.printStackTrace(); // 자세하게, 원래 JVM에서 뜨는거 처럼 알려주네
			System.err.println("숫자는 0으로 나눌 수 없습니다.");
		} catch(NullPointerException ex) { // catch 안에 예외 클래스
			// 개발자가 예외 처리하는 코드
			System.err.println(ex.getMessage());
			System.err.println("널포인트 오류 발생");
		} finally {
			// 예외가 발생해도 실행됨
			System.out.println("반드시 실행되어야 하는 코드");
			System.out.println("리소스 반납 코드");
		}
	}
	
	// 예외처리를 한번에 하고 싶어.. -> 부모 타입으로 자동형변환?
	public static void exceptionHandling2() {
		try {
			int x = 10, y= 2;
			System.out.println(x/y);
			
			String name = null;
			System.out.println(name.length());
			
		} catch(Exception ex) {
			System.err.println(ex.getMessage());
			if (ex instanceof ArithmeticException) { // 근데 걍 getMessage하면 알 수 있지않나
				System.err.println("숫자는 0으로 나눌 수 없습니다.");
			} else if(ex instanceof NullPointerException) {
				System.err.println("생성된 객체가 없습니다..");
			}
			
		}
	}
	
	
	// throws 예제
	public static void inputMoney() throws NotBalanceException{ // 강제 예외 떠넘기기
		System.out.print("입금 금액 : ");
		Scanner scanner = new Scanner(System.in);
		long money = scanner.nextLong();
		//입력데이터 검증
		if(money <= 0) {
			// 사용자 강제 예외 발생
			throw new NotBalanceException("금액은 0이거나 음수일 수 없습니다.",100);
		}
		System.out.println("정상 입금 처리되었습니다.");
	}
	
	
	
	// 이클립스 자동 기능
	public static void eclipseTest() {
		try {
			inputMoney();
		} catch (NotBalanceException e) {
			System.out.println(e);
		}
	}
	
	public static void standardAPITest() {
		try {
			int c = System.in.read();  // 얘 뒤에 throws 있어서 그럼 - 얘근데 하나밖에 못 읽네?
			//System.out.println(c);
			char c2 = (char)c;
			System.out.println(c2);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) {
		System.out.println("프로그램 시작됨..");
		//exceptionHandling1();
		//exceptionHandling2();
		standardAPITest();
//		try {
//			inputMoney(); //try catch 또 해줘야대....
//		} catch(Exception e) {
//			System.out.println(e);
//		}
		

		
//		int[] array = {1,2};
//		for (int i = 0; i < 10; i++) {
//			System.out.println(array[i]);
//		}
		
		// JVM 기본 처리 메커니즘
//		ArrayIndexOutOfBoundsException ex = new ArrayIndexOutOfBoundsException("Index 2 out of bounds for length 2");
//		System.out.println(ex.getMessage()); // Index 저거 가져오는거 그리고 출력
//		System.exit(0);
//		
		System.out.println("프로그램 종료됨..");
		

	}

}
