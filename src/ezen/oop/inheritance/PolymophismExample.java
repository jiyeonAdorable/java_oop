package ezen.oop.inheritance;

import ezen.oop.ams.Account;
import ezen.oop.ams.AccountRepository;
import ezen.oop.ams.MinusAccount;

public class PolymophismExample {

	public static void main(String[] args) {
		//클래스 자동형변환
		Shape shape ;
		shape = new Circle(10,10,5); // 짜잔...
		shape.draw(); // circle의 메소드가 호출되었다.
		
		shape = new Rectangle(10,10,2,3);
		shape.draw(); // rectangle의 메소드가 호출되었다.
		
		SomeClass some = new SomeClass();
		//some.showShape(new Shape());  // 추상클래스 돼서 안됨..
		some.showShape(new Circle(10,10,50));
		some.showShape(new Rectangle());
		
		AccountRepository repository = new AccountRepository();
		repository.addAccount(new Account("김기정",1111,1000));
		repository.addAccount(new Account("강기정",1111,1000));
		repository.addAccount(new MinusAccount("강대출",1111,1000,100000000));
		repository.addAccount(new MinusAccount("김대출",1111,1000,100000000));
		
		for (int i = 0; i < repository.getCount(); i++) {
			if(repository.getAccounts()[i] instanceof MinusAccount) { //instanceof의 활용..
				System.out.println("마이너스 통장\t"+repository.getAccounts()[i]);
			} else {
				System.out.println("입출금 통장\t"+repository.getAccounts()[i]);
			}
		}
		
		String message1 ="Java King!";
		String message2 ="Java King!";
		System.out.println(message1.equals(message2));
		
		Account account1 = new Account("김기정",1111,1000);
		Account account2 = new Account("김기정",1111,1000);
		System.out.println(account1.equals(account2));
		
		//자동형변환
		Account account = new MinusAccount("강대출",1111,1000,100000000);
		// 자동형변환의 경우 자식 클래스에서 재정의한 메소드인 경우 호출 가능
		System.out.println(account.getRestMoney());
		//자동형변환은 추가된 필드나 메소드인 경우 호출 불가
		// account.getBorrowMoney();
		
		//강제형변환
		MinusAccount minusAccount = (MinusAccount)account;
		
		//강제형변환 후 추가된 메소드 호출 가능
		System.out.println(minusAccount.getBorrowMoney());
		
		Account searcAccount = repository.searchAccount("1002");
		System.out.println(searcAccount);
		minusAccount = (MinusAccount)searcAccount;
		System.out.println(minusAccount.getBorrowMoney());

	}

}
