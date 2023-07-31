

import ezen.oop.ams.Account;

/*
 * 
 */
public class AccountExample {

	public static void main(String[] args) {
		Account account; // 선언만한거야
		account = new Account(); //할당
		
		Account ac1 = new Account(); // 선언과 동시에 할당
		
		//초기화 방법2
//		Account.bankName="이젠은행"; //스태틱변수는 클래스이름으로 접근 가능하다.
		
		Account a1 = new Account("임지연",1111,10000);
		Account a2 = new Account("홍길동",1111,10000);
		Account a3 = new Account("손오공",1111,10000);
		System.out.println(a1.getAccountNum()); //계좌번호가 하나씩 증가했다.
		System.out.println(a2.getAccountNum());
		System.out.println(a3.getAccountNum());

		
		//계좌 개설
		//account.accountNum="123-123456-12-123";
		account.setAccountNum("123-123456-12-123");
		
		//account.accountOwner="임지연";
		account.setAccountOwner("임지연");
		
		//account.passwd=1234;
		account.setPasswd(1234);
		
		//account.restMoney=123412341234L; //long 이니까 L 붙여야지
		account.setRestMoney(123412341234L);
		
		//계좌 개설2
		//ac1.accountNum="111-111111-11-111";
		ac1.setAccountNum("111-111111-11-111");
		 
		//ac1.accountOwner="홍길동";
		ac1.setAccountOwner("홍길동");
		
		
		ac1.setPasswd(1111);
		
		//ac1.restMoney=10000L;
		ac1.setRestMoney(10000L);
		
		//개설된 계좌의 기능 사용
		
		//비밀번호 확인
		if(ac1.checkPasswd(1111)) {
			//System.out.println(ac1.accountOwner+"님 환영합니다.");
			System.out.println(ac1.getAccountOwner()+"님 환영합니다.");
			System.out.println("출금 후 잔액 : " +ac1.withdraw(1000L)); // -1000
			System.out.println("출금 후 잔액 : " +ac1.withdraw(1000L)); // -1000
		
		} else {
			System.out.println("비밀번호가 다릅니다.");
		}
		
		if(account.checkPasswd(1111)) {
			//System.out.println(account.accountOwner+"님 환영합니다.");
			long money = account.getRestMoney(); //잔액 확인
			System.out.println("현재 잔액 : "+money);
			long restMoney = account.deposit(100000000000L); // 입금
			System.out.println("입금 후 현재 잔액 : "+restMoney);
		} else {
			System.out.println("비밀번호가 다릅니다.");
		}
		
		
		// 스태틱 메소드도 스태틱 변수처럼 인스턴스 생성 없이
		// 클래스 이름으로 바로 접근하여 사용할 수 있다.
		System.out.println(Account.getAccountId());
		
		
		

	}

}
