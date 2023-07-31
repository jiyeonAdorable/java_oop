package ezen.oop.array;

public class ArrayUtil {

	// 배열 복사 기능 메소드
	public static int[] arrayCopy(int[] array, int increament) {
		int[] copyArray = new int[array.length + increament];
		for (int i = 0; i < array.length; i++) {
			copyArray[i] = array[i];
		}
		return copyArray;
	}

	// 오름차순, 내림차순 구분하기 위한 상수
	public static final int ASC = 0;
	public static final int DESC = 1;

	
	// 배열 정렬 (오름차순, 내림차순)
	public static void sort(int[] array, int srotBy) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (srotBy == ASC) {
					if (array[j] > array[j + 1]) {
						int num = array[j];
						array[j] = array[j + 1];
						array[j + 1] = num;
					}
				} else {
					if (array[j] < array[j + 1]) {
						int num = array[j];
						array[j] = array[j + 1];
						array[j + 1] = num;
					}
				}
			}

		}
	}

}
