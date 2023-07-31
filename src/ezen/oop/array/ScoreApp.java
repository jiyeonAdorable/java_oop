package ezen.oop.array;

/*
 * 성적 관리 어플
 */
public class ScoreApp {

	public static void main(String[] args) {
		// Student student1 = new Student(1, "임지연", 90);
		// student1.printInfo();

		// 참조타입 배열 선언, 생성, 초기화
//		Student[] students;
//		students = new Student[27];
//		students[0] = new Student(1, "임지연", 90); // 참조 배열은 한번 더 new...
//		// ...
//		students[26] = new Student(26, "홍길동", 95);

		
		// 한번에~
		Student[] students ={
				new Student(1,"김기정",90),
				new Student(2,"강소영",95),
				new Student(3,"김지연",100),
				new Student(4,"고유나",90),
		};
		
		System.out.println("번호\t 이름  점수");
		double total=0, avg = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				students[i].printInfo();
				total += students[i].getScore();
			}
		}
		avg = total/students.length;
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);

	}

}
