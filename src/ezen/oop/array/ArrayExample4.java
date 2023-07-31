/*
 * 배열 복사하기
 */
package ezen.oop.array;

public class ArrayExample4 {
	// 배열 복사 기능 메소드
	public static int[] arrayCopy(int[] array, int increament) {
		int[] copyArray = new int[array.length+increament];
		for (int i = 0; i < array.length; i++) {
			copyArray[i] = array[i];
			
		}
		return copyArray;
	}
	
	
	
	
	
	public static void main(String[] args) {
		int [] array = {5, 1, 3, 7, 4, 2, 6, 9, 8};
		//~~~~~~~~~~~~~~~~
		
//		// 배열 복사
//		int [] array2 = new int[array.length+1]; // 1개 추가할래
//		for (int i = 0; i < array.length; i++) {
//			array2[i] = array[i];   //배열 값 옮기기
//		}
//		
//		for (int i = 0; i < array2.length; i++) {
//			System.out.println(array2[i]);
//		}
		
		//메소드 호출을 이용한 배열 복사
		int[]array2 = arrayCopy(array, 3);
		
		// 복사된 배열 출력
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		// 배열 정렬 로직을 작성하시오. 힌트: 변수 1개 있어야함
//		for (int i = 0; i < array.length-1; i++) {
//			for (int j = 0; j < array.length-1; j++) {
//				if(array[j]>array[j+1]) {
//					int num=array[j];
//					array[j] = array[j+1];
//					array[j+1] =num;
//				}
//			}
//			
//		}
		
		ArrayUtil.sort(array, ArrayUtil.ASC); // 오름차순 0대신 상수로... 
		ArrayUtil.sort(array, ArrayUtil.DESC); // 내림차순 1대신 상수로... 
		
		// 배열 정렬하여 출력하기
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
		
		
		
	}

}
