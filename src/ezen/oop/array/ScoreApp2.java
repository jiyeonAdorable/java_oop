package ezen.oop.array;

/*
 * 성적 관리 어플
 */
public class ScoreApp2 {

	public static void main(String[] args) {
		
		// 2차원 참조배열 한번에~
		Student[][] students ={
				{
				new Student(1,"김기정",90),
				new Student(2,"강소영",95),
				new Student(3,"김지연",100),
				new Student(4,"고유나",90)
				},
				{
				new Student(1,"김기정",90),
				new Student(2,"강소영",95),
				new Student(3,"김지연",100),
				},
				{
				new Student(1,"김기정",90),
				new Student(2,"강소영",95),
				}
		};
		
		
		
		for (int i = 0; i < students.length; i++) {
			System.out.println("\t"+(i+1)+"반");
			System.out.println("번호\t 이름  점수");
			double total=0, avg = 0;
			for (int j = 0; j < students[i].length; j++) {
				if (students[i][j] != null) {
				
				students[i][j].printInfo();
				total += students[i][j].getScore();
				}
			}
			avg = total/students[i].length;
			System.out.println("총점 : "+total);
			System.out.println("평균 : "+avg);
			System.out.println();
		}
		
		

	}

}
