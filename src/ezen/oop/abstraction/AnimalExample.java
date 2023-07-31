package ezen.oop.abstraction;

public class AnimalExample {

	public static void main(String[] args) {
		// 추상 클래스는 new 생성자 호출을 이용하여 생성할 수 없다.
		//Animal animal = new Animal(); - 안됨
		
		
		// 추상클래스는 타입으로 선언 가능
		Animal animal;
		animal = new Dog("루니",7); // 자동형변환
		animal.eat();
		animal.sleep();
		animal.walk();
		
		animal = new Cat("야옹이",3);
		animal.eat();
		animal.sleep();
		animal.walk();
		
		//새롭게 추가된 메소드 호출
		Cat cat = (Cat)animal; // 강제형변환
		cat.jump();

	}

}
