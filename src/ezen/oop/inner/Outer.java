package ezen.oop.inner;

public class Outer {
	int x;
	String message;
	
	public Outer() {}
	public Outer(int x, String message) {
		this.x = x;
		this.message = message;
	}
	
	public void doSome() {
		Inner inner = new Inner(); // 내부 메소드 사용하기 위해서 내부 객체 생성..
		inner.doTask();
		
		Inner2 inner2 = new Inner2();
		inner2.method1();
		Inner2.method2();
		
		// 지역 클래스 정의
		class Local {
			int x;
			
			Local(int x) {
				this.x=x;
				Outer.this.x=x; // 외부 클래스의 x의 값을 내부에서 초기화 하고 싶을 때
			}
			
			public void doTask() {
				System.out.println("doTask() 실행됨..");
			}
		}
		
		Local local = new Local(10);
		local.doTask();
		
		
		
	}
	
	// 인스턴스 멤버 내부 클래스
	public class Inner {
		int y;
		
		public Inner() {}
		public Inner(int y) {
			this.y = y;
		}
		
		public void doTask() {
			System.out.println("외부 클래스의 x 값 : "+x); // 외부 필드 접근 가능
		}
	}
	
	
	// 정적(static) 멤버 내부 클래스
	static class Inner2{
		int z;
		static int a;
		
		public Inner2() {
			z=10;
		}
		
		public void method1() {
			System.out.println("method1() 실행됨");
		}
		
		public static void method2() {
			System.out.println("method2() 실행됨");
		}
		
		
	}
	

}
