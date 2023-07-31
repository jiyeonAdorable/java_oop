package ezen.oop.api;

/**
 * 입력데이터 유효성 검증 공통 기능 정의 유틸리티
 * @author 임지연
 *
 */
public class Validator {
	
	public static boolean hasText(String input) {
		if(input != null && input.trim().length() !=0) {
			return true;
		} return false;
	}
	
	/**
	 * 입력데이터가 숫자인지 여부 체크
	 * @param 입력 문자열
	 * @return 유효 여부
	 */
	public static boolean isNumber(String number) {
		for (int i = 0; i < number.length(); i++) {
			char c = number.charAt(i);
			if(!Character.isDigit(c)) {
				return false;
			}
		} return true;
	}
	
	
	/**
	 * 
	 * @param 입력 문자열
	 * @return 유효 여부
	 */
	public static boolean isId(String id) {
		for (int i = 0; i < id.length(); i++) {
			char c = id.charAt(i);
			if(!Character.isDigit(c) && !Character.isAlphabetic(c)) {
				return false;
			}
		} return true;
	}
	
	
	//테스트용 main
	public static void main(String[] args) {
		String string = "sd";
		System.out.println(Validator.hasText(string));
	}

}
