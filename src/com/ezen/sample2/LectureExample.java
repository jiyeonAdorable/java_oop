package com.ezen.sample2;

import java.util.Date;

import com.ezen.sample.Lecture; //사용하고자 하는 패키지명 + 클래스명

public class LectureExample {

	public static void main(String[] args) {
		Lecture lecture = new Lecture("냥");
		lecture.printName();
		Date today =  new Date();
		System.out.println(today.toLocaleString()); //지역 시간 정보..
		// 옛날에 1999년까지만 계산해서.. 2000년 이후로는 버그가 많음 쓰지마. calender 쓸거임(현대판)
		
		// 자바 표준 API의 java.lang은 기본패키지이므로 import 하지 않아도 됨.
		String message;
	}

}
