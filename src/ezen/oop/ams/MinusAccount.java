package ezen.oop.ams;

public class MinusAccount extends Account{
	// 부모클래스에 없는 필드나 메소드 추가(확장)
	
	private long borrowMoney;
	
	public MinusAccount( ) {
		// 컴파일시 부모클래스의 디폴트 생성자를 호출하는 super(); 자동추가
		//super();
	};
	public MinusAccount(String accountOwner, int passwd, long restMoney,long borrowMoney) { 
		// 상속 받고 생성자 초기화 할 때, 부모도 생성자 초기화해야한다. (근데 private 때문에 안됨..)
		super(accountOwner, passwd, restMoney); //부모클래스 생성자 호출 (생성자는 public이니까)
		this.borrowMoney = borrowMoney;
	}
	
	// 메소드 추가
	public long getBorrowMoney() {
		return borrowMoney;
	}
	public void setBorrowMoney(long borrowMoney) {
		this.borrowMoney = borrowMoney;
	}
	
	//필요에 따라 부모 클래스의 메소드 재정의(Overriding)
	@Override //이건 나중에..
	public long getRestMoney() {
		return super.getRestMoney()- borrowMoney;// getRestMoney()만 하면 바로 위에 있는 자식 메소드를 호출한다. super!
	}
	
	@Override
	public String toString() {
		return super.toString()+"\t"+borrowMoney;
	}
	
	
	
	
	
	

}
