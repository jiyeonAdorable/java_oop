/*
 * 기본 타입 배열
 */
package ezen.oop.array;

public class ArrayExample {

	public static void main(String[] args) {
		
		//int형 배열 scores을 만들겠다. int[] : 클래스느낌, scores: 래퍼런스변수
		int[] scores; // Account account; 같은 느낌
		
		//배열 인스턴스(객체) 생성
		scores = new int[27]; //27개 짜리.. 배열 명시적 생성
		
		//배열의 원소(요소) 접근
		System.out.println(scores[0]);
		
		//값 할당
		scores[0]= 95;
		scores[1]= 50;
		//.......
		scores[26]= 100;
		
		
		System.out.println(scores[26]);
		
		
		// for문으로 값 할당+출력+총합..
		// for문으로 length 쓸 때, 배열 개수를 바꿔도 이 코드는 안 고쳐도 됨.
		
		double sum=0;
		for(int i=0;i<scores.length;i++) { //scores.length: 원소 개수
			scores[i] = (70+i);
			System.out.print(scores[i]+" ");
			sum+=scores[i];
		}
		System.out.println("점수 총합: "+sum);
		
		//점수 평균 구하기
		double avg=sum/scores.length;
		System.out.println("평균: "+avg);
		
	}

}
