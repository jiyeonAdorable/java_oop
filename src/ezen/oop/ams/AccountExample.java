package ezen.oop.ams;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account("김기정", 1111, 10000);
		
		// cmd에 출력하든, GUI에 출력하든, 웹화면에 출력하든 모두 재사용할 수 있다.
		System.out.println(account);
		
		MinusAccount ma = new MinusAccount("김기정",1111,10000,10000000);
		System.out.println(ma);

	}

}
