package ezen.oop.ams;

import java.util.Objects;

/*
 * 은행 계좌 추상화
 */
public class Account /*extends Object*/{
	//필드 캡슐화 (은닉화, private했으니까)
	//인스턴스 변수들
	private String accountNum;
	private String accountOwner;
	private int passwd;
	private long restMoney;
	
	//스태틱(정적) 변수, 클래스 변수들..
	//public static String bankName = "이젠은행" ; //초기화 방법 1
	
	//final: 상수는 선언될 때 값을 초기화해줘야한다.
	public final static String BANK_NAME="이젠은행";
//	private static int accountId = 1000; //계좌번호를 하나씩 추가해야하니까 정수로
	private static int accountId;
	
	//초기화 블록
	//static 초기화 블록
	static{
		//System.out.println("초기화 블록 진행됨..");
		// 주로 애플리케이션 환경설정 파일의 내용을 읽어오는 코드들이 주로 많이 들어간다.
		// 또는 DB, 파일 읽어오는거!
		//--
		//-- 길게 들어온다..
		accountId=1000;
	}
	
	//생성자 자동 생성(기본) 우클릭- sourse -GCFS
	public Account() {
		
	}
	
	//생성자 자동 생성 우클릭- sourse -GCUF
	public Account(String accountOwner, int passwd, long restMoney) {
		//System.out.println("생성자 실행됨...");
		this.accountNum = (accountId++)+""; //문자열에 숫자를 못 할당하니까 먼저 ++하고 ""문자열로 합치기
		this.accountOwner = accountOwner;
		this.passwd = passwd;
		this.restMoney = restMoney;
	}


	// setter /getter 메소드
	public String getAccountNum() {
		return accountNum;
	}
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public int getPasswd() {
		return passwd;
	}

	public void setPasswd(int passwd) {
		this.passwd = passwd;
	}

	public void setRestMoney(long restMoney) { //왜 get이 없나 했더니 밑에 잔액 조회로 이미 만들었네..ㅋ
		this.restMoney = restMoney;
	}
	

	//입금 기능
	public long deposit(long money) {
		return restMoney += money;
		
	}
	
	//출금 기능
	public long withdraw(long money) {
		return restMoney -= money;
	}
	
	//잔액조회 기능
	public long getRestMoney() { // 전달할게 없으니 매개변수가 없다.
		return restMoney;
	}
	
	//비밀번호 확인 가능
	public boolean checkPasswd (int pwd) {
		return passwd ==pwd; //if문 안써도 되넹..
		
	}
	
	public void printInfo() {
		System.out.println(accountNum+"\t"+accountOwner+"\t"+"****"+"\t"+restMoney);
	}
	
	
	
	@Override
	public String toString() {
		return accountNum+"\t"+accountOwner+"\t"+"****"+"\t"+restMoney;
	}

	@Override
	public boolean equals(Object obj) {
		return toString().equals(obj.toString()); //현재는 무조건 false임 계좌번호가 다르니까
	}

	public static int getAccountId() { //스태틱(클래스) 메소드 - 인스턴스 생성 안해도 사용하고 싶어! (왜 쓴거임?)
		return accountId;
	}
	
	

}
