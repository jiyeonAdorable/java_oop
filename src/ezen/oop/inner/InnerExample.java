package ezen.oop.inner;

import ezen.oop.inner.Outer.Inner2;

public class InnerExample {

	public static void main(String[] args) {
		Outer outer = new Outer(5,"내부클래스");
		outer.doSome();
		System.out.println(outer.x);
		
		// 인스턴스 멤버 내부 클래스 객체 선언 방법
		Outer.Inner inner = outer.new Inner(); // 외부 객체를 생성하고 ... 그 뒤에 이런 방법...
		inner.doTask();
		//Outer.Inner inner2 = new Outer().new Inner();
		
		
		// static 멤버 내부 클래스 생성 방법
		Outer.Inner2 inner2 = new Outer.Inner2(); // 인스턴스 내부 클래스와 약간 다르다.
		inner2.method1();
		
		Inner2.method2();
		

	}

}
