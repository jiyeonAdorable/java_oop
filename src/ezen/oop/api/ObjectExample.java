package ezen.oop.api;

import ezen.oop.array.Student;
public class ObjectExample {

	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.hashCode()); //10진수
		System.out.println(obj.toString()); //16진수
		
		Object obj2 = new Object();
		System.out.println(obj2.hashCode());
		
		
		String name = "Java";
		System.out.println(name.hashCode());
		
		Student student1 = new Student(1,"김기정",90);
		System.out.println(student1);
		
		Student student2 = new Student(1,"김기정",90);
		System.out.println(student1.equals(student2));
		
		try {
			Student student3 = (Student)student1.clone();
			System.out.println(student3);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
