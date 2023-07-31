package ezen.oop.inheritance;

public class ShapeExample {

	public static void main(String[] args) {
//		Shape shape  = new Shape(10,10);
//		shape.draw();
//		System.out.println(shape.getLength());
//		System.out.println(shape.getArea());
//		System.out.println(shape.toString()); 
		
		// 추상클래스는 인스턴스 생성 불가 but, 데이터 타입으로는 사용 가능.
		Shape shape = new Circle(10,10,5);
		Circle circle1 = new Circle(10,10,5);
		shape.draw();
		System.out.println(shape.getLength());
		System.out.println(shape.getArea());
		
		shape = new Rectangle(10, 10, 100, 5);
		shape.draw();
		System.out.println(shape.getLength());
		System.out.println(shape.getArea());
		
		
		// Object의 toString() 재사용
		
		System.out.println(shape.toString());//System.out.println(shape); 같은 뜻
		System.out.println(shape.toString());
		// 참조변수를 출력하면 Object의 toString() 메소드가 자동 호출된다..
		// 주소값을 연산하지 못하게 하는 역할의 메소드
		
		
		
		// 값이 같은지 재정의한 equals()로 비교
		System.out.println(shape.equals(circle1)); // 해시값이 달라서 false 뜨넹.. 하 진짜 골치아프다

	}

}
