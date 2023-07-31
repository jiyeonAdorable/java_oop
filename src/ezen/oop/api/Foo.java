package ezen.oop.api;
/**
 * 싱글톤(Singleton)패턴 적용 클래스
 * @author 임지연
 *
 */
public class Foo {
	private String name="김기정";
	private static Foo instance = new Foo();
	
	private Foo() {} // 생성자를 막아버리면 객체를 외부에서 못 만든다.
	
	public static Foo getInstance() {
		return instance;
	}
	
	public String getName() {
		return name;
	}

}
