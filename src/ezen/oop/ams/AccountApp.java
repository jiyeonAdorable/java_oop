package ezen.oop.ams;
/*
 * 1차원 배열을 이용한 계좌 목록 관리
 */

public class AccountApp {

	public static void main(String[] args) {
		Account[] accounts = new Account[100];
		
		
		int index =0;
		//새로운 계좌 개설
		
		Account account = new Account("김기정",1111,100000);  // 왜 이렇게 했지...? 객체화해서 넣으려고?
		accounts[index++] = account; //변수 사용 후 1 증가
		Account account2= new Account("이희영",1111,1000000);
		accounts[index++] = account2;
		Account account3= new Account("강소영",1111,10000000);
		accounts[index++] = account3;
		
		System.out.println("------전체 계좌 조회------");
		//전체 계좌 목록 조회
		for (int i = 0; i < index; i++) {
			accounts[i].printInfo();
		}
		
		System.out.println("------계좌 번호 검색 결과------");
		//계좌 번호로 계좌 검색
		String searchName = "1001";
		for (int i = 0; i < index; i++) {
			if(searchName.equals(accounts[i].getAccountNum())) { // string끼리 비교할 때는 equals를 쓰자..
				accounts[i].printInfo();
			}
		}
		
		
		

			
	}

}
