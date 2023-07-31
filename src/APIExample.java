/*
 * 자바 표준 API 사용 간단 실습
 */
public class APIExample {

	public static void main(String[] args) {
		
		// String 클래스로부터 인스턴스 생성
		String string = new String("이것이 자바다.."); //String은 클래스였다(대문자니까)
		
		// 생성된 인스턴스의 메소드 호출
		int count =string.length(); //문자열 개수
		
		System.out.println(count+"개의 문자로 이루어진 문자열입니다.");
		
		// 몇자리 수 일까요?
		int number = 45454545;
		String numString = String.valueOf(number); // 형변환 메소드 (정수 -> 문자열)
		int count2 = numString.length();
		System.out.println(count2 +"자리로 구성된 정수입니다.");
		
		
		//Math 클래스를 이용하여 절대값 구하기
		//Math 클래스는 100% 상수와 static 메소드로 구성된 대표적인 클래스이다.
		int x = -150;
		int y = Math.abs(x); //abs 절대값
		System.out.println(x+"의 절대값은 "+y+"입니다.");
		
		

	}

}
