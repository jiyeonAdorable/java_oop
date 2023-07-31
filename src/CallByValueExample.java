import ezen.oop.ams.Account;

/*
 * Call by Value 개념
 */
public class CallByValueExample {
	public static int sum(int x , int y) {
		return x+y;
	}
	
	public static void doTask(Account account) { //연진아.. 참조 변수를 데려왔어..
		account.deposit(500000);
	}

	public static void main(String[] args) {
		int x = 50, y= 60;
		
		// call by value
		int result = sum(x,y); // x의 값과 y의 값을 복사해서 sum 메소드에 전달..
		System.out.println(x+"\t"+y+"\t"+result); // x와 y 값은 변하지 않는다.
		
		Account account = new Account("김기정",1111, 10000);
		
		//call by value
		doTask(account); //참조변수지만 주소"값"을 주는거니까 value야
		System.out.println(account.getRestMoney()); // 원래 10000이었는데 원본값이 바꼈어..(주소값이 전달 되어서!!!)
		
	

	}

}
