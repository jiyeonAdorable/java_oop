package ezen.oop.api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String formattedDate = simpleDateFormat.format(now);
		System.out.println(formattedDate); //? 나 왜 137일 나오지(대문자 DD해서..)
		
		System.out.println(now);
		System.out.println(now.toLocaleString()); //이래서 Date 안쓰고 Calender 쓰지..
		System.out.println(now.getHours());
		
		// 특정 날짜 설정
		Date hireDate = new Date(1987,3,2);
		System.out.println(hireDate);
		
	}
}
