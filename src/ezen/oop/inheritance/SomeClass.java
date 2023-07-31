package ezen.oop.inheritance;

public class SomeClass {

	public void showShape(Shape shape) {
		if (shape instanceof Circle) {
			shape.draw();
			Circle circle = (Circle)shape;
			System.out.println(circle.getRadian());
		}
		
		
	}

}
