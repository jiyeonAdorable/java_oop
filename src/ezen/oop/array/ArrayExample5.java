/*
 * 동적 다차원 배열
 */
package ezen.oop.array;

public class ArrayExample5 {
	
	public static void main(String[] args) {
//		int[][] scores;
//		scores = new int[3][];
//		scores[0] = new int[10];
//		scores[1] = new int[9];
//		scores[2] = new int[15];
//		scores[0][0] = 100;
//		//~~~~~~~~~~~~
//		scores[2][14] = 85;
		
		int[][] scores = {{100, 50, 10},{55},{44, 70}};
		for (int i = 0; i < scores.length; i++) {
			System.out.println(i+1+"반 학생");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
