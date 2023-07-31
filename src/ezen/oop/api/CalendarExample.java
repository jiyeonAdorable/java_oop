package ezen.oop.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int hh = calendar.get(Calendar.HOUR_OF_DAY); // HOUR - 12시간제, HOUR_OF_DAY - 24시간제
		int mm = calendar.get(Calendar.MINUTE);
		int ss = calendar.get(Calendar.SECOND);
		
		System.out.println(year);
		System.out.println(month); //월만 0부터 시작한다..
		System.out.println(dayOfMonth);
		System.out.println(hh);
		System.out.println(mm);
		System.out.println(ss);
		
		//특정 날짜 설정
		calendar.set(Calendar.YEAR, 1987);
		calendar.set(Calendar.MONTH, 3-1); // 3월
		calendar.set(Calendar.DAY_OF_MONTH, 13);
		System.out.println(calendar.get(Calendar.YEAR));
		
		String ymd = calendar.get(Calendar.YEAR)+"년"+(calendar.get(Calendar.MONTH)+1)+"월";
		System.out.println(ymd);
		
		StringBuilder sb = new StringBuilder();
		sb.append(calendar.get(Calendar.YEAR)).append("년").append((calendar.get(Calendar.MONTH)+1)).append("월");
		System.out.println(sb);
		
		long ms = calendar.getTimeInMillis(); //1970년 1월 1일 0시 0분 0초부터 흘러온 0.001초
		System.out.println(ms);
		
		//Date date = new Date(ms);
		Date date = calendar.getTime();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String formattedDate = simpleDateFormat.format(ms);
		String formattedDate1 = simpleDateFormat.format(date);
		System.out.println(formattedDate); // 시간을 calendar로 받아서 date로 편하게 쓰기^^ 
		System.out.println(formattedDate1);// 근데 date 안받아도 되는데..?
		int w = calendar.get(Calendar.DAY_OF_WEEK); // 무조건 int형으로 나옴..
		System.out.println(w);
		switch (w) {
			case Calendar.SUNDAY:
				System.out.println("일");
				break;
			case Calendar.MONDAY:
				System.out.println("월");
				break;
			case Calendar.TUESDAY:
				System.out.println("화");
				break;
			case Calendar.WEDNESDAY:
				System.out.println("수");
				break;
			case Calendar.THURSDAY:
				System.out.println("목");
				break;
			case Calendar.FRIDAY:
				System.out.println("금");
				break;
			case Calendar.SATURDAY:
				System.out.println("토");
				break;
	
			default:
		}
		
		//int result =  getWorksDay("19870313","20230517");
		int result =  getWorksDay("20230501","20230517");
		System.out.println(result);

	}
	
	//특정 날짜와 특정 날짜 사이의 근무일수 (주말 뺴야함?)
	//근무 일수 구하기 0.요일구하기, 윤년은? 1.쪼개기 2.빼기 0517 0510
	//for문돌릴까? 평일 나올때마다 1씩 추가하는거야..
	public static int getWorksDay(String startDate, String endDate) {
		Calendar calendar = Calendar.getInstance();
//		Date date = calendar.getTime();
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
//		String formattedDate = simpleDateFormat.format(date);
//		System.out.println(formattedDate);
		String[] start = new String[3];
		start[0] = startDate.substring(0, 4);
		start[1] = startDate.substring(4, 6);
		start[2] = startDate.substring(6, 8);
		
		String[] end = new String[3];
		end[0] = endDate.substring(0, 4);
		end[1] = endDate.substring(4, 6);
		end[2] = endDate.substring(6, 8);
		
		int[] startNum = new int[3];
		for (int i = 0; i < start.length; i++) {
			startNum[i] = Integer.valueOf(start[i]);
		}
		int[] endNum = new int[3];
		for (int i = 0; i < start.length; i++) {
			endNum[i] = Integer.valueOf(end[i]);
		}
		
		System.out.println(calendar.get(Calendar.YEAR));
		
		return 0;
	}

}
