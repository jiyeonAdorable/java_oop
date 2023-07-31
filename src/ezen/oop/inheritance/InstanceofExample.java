package ezen.oop.inheritance;

import ezen.oop.ams.Account;
import ezen.oop.ams.MinusAccount;

public class InstanceofExample {

	public static void main(String[] args) {
		//비교할 때 항상 자식부터해야한다.
		MinusAccount minusaccount = new MinusAccount();
		Account account = new MinusAccount();
		System.out.println(minusaccount instanceof MinusAccount);
		System.out.println(minusaccount instanceof Account);
		System.out.println(account instanceof Account);
		System.out.println(account instanceof MinusAccount);
		System.out.println(minusaccount instanceof Object);
		
		
		

	}

}
