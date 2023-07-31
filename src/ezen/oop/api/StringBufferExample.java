package ezen.oop.api;

public class StringBufferExample {

	public static void main(String[] args) {
		//StringBuffer는 동기처리
		//StringBuilder는 비동기처리
		//StringBuffer sb = new StringBuffer("Java");
		StringBuilder sb = new StringBuilder("Java");
		sb.append("!").append("?").append("!"); // 코드 체인
		System.out.println(sb);
		sb.insert(4, "--");
		System.out.println(sb);

	}

}
