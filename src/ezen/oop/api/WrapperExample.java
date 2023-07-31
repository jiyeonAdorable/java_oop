package ezen.oop.api;

public class WrapperExample {

	public static void main(String[] args) {
		// Integer
		int x = 50;
		//Integer integer = new Integer(x); // 사용하지 말래......
		Integer integer = Integer.valueOf(x); // 이렇게 포장
		byte b = integer.byteValue(); // byte 타입으로 바뀜..
		
		String str = "50";
		int value = Integer.parseInt(str);
		System.out.println(value);
		
		String str2 = "1010";
		value = Integer.parseInt(str2, 2);
		System.out.println(value);
		
		int y = 5678;
		System.out.println(Integer.toString(y, 2)); //2진수로...
		System.out.println(Integer.toString(y, 16)); //16진수로..
		
		System.out.println(Integer.toBinaryString(5000)); //2진수로..
		System.out.println(Integer.toOctalString(5000)); //8진수로..
		System.out.println(Integer.toHexString(5000)); //16진수로..
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		//Character
		String id="bangry#123";
		char[] data = id.toCharArray();
		for (int i = 0; i < data.length; i++) {
			if(Character.isUpperCase(data[i])){
				System.out.println(data[i] + "은 대문자이다.");
			}else if(Character.isLowerCase(data[i])){
				System.out.println(data[i] + "은 소문자이다.");
			}else if(Character.isDigit(data[i])){ // 자주씀
				System.out.println(data[i] + "은 숫자이다.");
			}else if(Character.isSpaceChar(data[i])){
				System.out.println(data[i] + "은 공백문자이다.");
			}
		}
		
		//Double
		double d = 15.5;
		int z = 0;
		input(d/z);
		System.out.println(d/z); //Infinity 뜸
		System.out.println("NaN 체크 : " + Double.isNaN(d/0));
		System.out.println("무한대 체크 : " + Double.isInfinite(d/0)); //무한대 체크는 ==로 하면안대
		System.out.println("double 최대값 : " + Double.MAX_VALUE);
		System.out.println("double 최소값 : " + Double.MIN_VALUE);
		System.out.println(isNumber("1213155"));
		System.out.println(isId("123ascs"));
		}
	
		//더블형일 때는 무한대가 나올수 있기 때문에 무한대를 체크해야함.
		public static void input(double d) {
			if(Double.isInfinite(d)) {
				System.out.println("잘못된 입력값이다..");
				return;
			}
			System.out.println(d+10);
		}
		
		//숫자 검증(숫자만 들어왔는가?)
		public static boolean isNumber(String number) {
			for (int i = 0; i < number.length(); i++) {
				char c = number.charAt(i);
				if(!Character.isDigit(c)) {
					return false;
				}
			} return true;
		}
		
		public static boolean isId(String id) {
			for (int i = 0; i < id.length(); i++) {
				char c = id.charAt(i);
				if(!Character.isDigit(c) && !Character.isAlphabetic(c)) {
					return false;
				}
			} return true;
		}
		
		
		
		
	
}
