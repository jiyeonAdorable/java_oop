package ezen.oop.api;

import java.util.StringTokenizer;

public class StringTokenlizerExample {

	public static void main(String[] args) {
		String cardNumber = "1111-2222-3333-4444";
		StringTokenizer st = new StringTokenizer(cardNumber,"-");//생략하면 기본적으로 스페이스바
		
		System.out.println(st.countTokens());
		String[] tokens = new String[st.countTokens()];
		int index =0;
		while(st.hasMoreElements()) { // 얜 그냥 while문으로 음..
			tokens[index++]=st.nextToken();
		}
		
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}

	}

}
