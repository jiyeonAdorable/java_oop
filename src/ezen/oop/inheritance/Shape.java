package ezen.oop.inheritance;

/**
 * 추상클래스 정의
 * @author 임지연
 *
 */
public abstract class Shape {
	
	protected double x;
	protected double y;
	
	
	// 추상 메소드 (선언만 됐음)
	public abstract void draw();
	
	public abstract double getLength();
	
	public abstract double getArea();


}
