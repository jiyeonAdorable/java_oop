package ezen.oop.inheritance;

public class Rectangle extends Shape {
	
	private double width;
	private double height;

	public Rectangle() {
		super();
	}
	
	public Rectangle(double x, double y, double width, double height) {
		this.x=x;
		this.y=y;
		this.width = width;
		this.height = height;
	}
	

	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public void draw() {
		System.out.println("시작좌표가 "+x+", "+y+"이고 폭이 "+width+"이고 높이가 "+height+"인 사각형입니다.");
	}
	
	@Override
	public double getLength() {
		return 2*(width+height);
	}
	
	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", x=" + x + ", y=" + y
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
