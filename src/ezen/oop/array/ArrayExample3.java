/*
 * 다차원 배열 사용하기
 */
package ezen.oop.array;

public class ArrayExample3 {

	public static void main(String[] args) {
//		int [][] classes;
//		classes = new int[5][10];
//		
//		classes[0][0] = 80;
//		//........
//		classes[0][9] = 100;
//		classes[4][0] = 99;
//		classes[4][4] = 50;

		//다차원 배열 선언/생성/초기화 동시에
		int[][] classes = {
				{88,95,60,77,100,1},
				{85,90,60,77,100},
				{88,90,68,77,100},
				{88,90,60,90,100},
				{88,90,70,55,100}}; //5 5
		
		
		// for문으로 각 반별 점수 출력..
		
		for (int i = 0; i < classes.length; i++) { //classes.length : 반 개수..
			double total=0, avg=0;
			System.out.println(i+1+"반 성적 목록\t"+classes[i].length+"명");
			for (int j = 0; j < classes[i].length; j++) { // classes[i].length : i+1반의 학생 수
				System.out.print(classes[i][j]+"\t");
				total += classes[i][j];
			}
			avg = total/classes[i].length;
			System.out.println();
			System.out.println(i+1+"반 총점: "+total);
			System.out.println(i+1+"반 평균: "+avg);
//			System.out.printf("%.5f\n",avg); // 소수점 출력 c에서 쓰는게 있넹...
			System.out.println();
		}
		
	}

}
