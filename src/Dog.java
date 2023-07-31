/*
 * 일상생활의 강아지(객체)를 프로그램으로 표현한 클래스 - 객체 추상화 클래스
 */
public class Dog {
	// 인스턴스 변수 (클래스에 선언됐으니까. 클래스는 인스턴스에 할당되니까)
	// 인스턴스 변수들 : *필드*
	private String name; // 강아지 이름 ~~~~~~~~~~ 값을 초기화 하면 안돼(선언만)
	private String type; // 견종
	private int age; // 강아지 나이
	
	
	// 따로 생성자 명시 안해도 컴파일러에 의해 자동
	// 생성되는 디폴트(기본값) 생성자 - 생성자 만들면 이거는 안만들어짐
	// 생성자에 의해 초기화하지 않은 인스턴스변수는 JVM에 의해 실행 시 자동 초기화 된다.
	// 정수:0, 실수:0.0, char:0, boolean:false로 자동 초기화
	// 참조형은 null로 초기화
//	Dog(){ //하지만 내가 만들었음
//		name=null; //아무런 값도 없다 뜻
//		type=null;
//		age=0; //int형은 자동으로 0
//	}
	Dog() {}
	
	//개발자가 정의하는 생성자
	public Dog(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	//생성자 오버로딩 (중복 정의..? - 생성 방법을 여러개 주는거)
	public Dog(String name, String type) {
		//this.name = name;
		//this.type = type;
		this(name, type, 0);
	}
	
	public Dog(String name, int age) {
		//this.name = name;
		//this.age = age;
		this(name, null, age);
	}
	
	
	// setter getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 인스턴스 메소드
	void bark() { //개가 짖는 행위
		System.out.println(name+"가 짖습니다. 월월");
	}
	
	void eat() { //개가 먹는 행위
		System.out.println(name+"가 먹습니다. 냠냠");
	}

}
