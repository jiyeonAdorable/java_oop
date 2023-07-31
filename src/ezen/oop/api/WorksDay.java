package ezen.oop.api;

import java.util.Calendar;

public class WorksDay {

	public static void main(String[] args) {
		int result = getWorksDay("19870313", "20230517");
		System.out.println("\n총 근무일수 : " + result);

	}

	// 특정 날짜와 특정 날짜 사이의 근무일수 (주말 뺴기, 공휴일은 음력때문에 포기)
	public static int getWorksDay(String startDate, String endDate) {
		// 받은 데이터 분류
		String[] start = new String[3];
		start[0] = startDate.substring(0, 4);
		start[1] = startDate.substring(4, 6);
		start[2] = startDate.substring(6, 8);

		String[] end = new String[3];
		end[0] = endDate.substring(0, 4);
		end[1] = endDate.substring(4, 6);
		end[2] = endDate.substring(6, 8);

		int[] startNum = new int[3];
		startNum[0] = Integer.valueOf(start[0]);
		startNum[1] = Integer.valueOf(start[1]) - 1; // 0월부터 1월이라..
		startNum[2] = Integer.valueOf(start[2]);
		int[] endNum = new int[3];
		endNum[0] = Integer.valueOf(end[0]);
		endNum[1] = Integer.valueOf(end[1]) - 1;
		endNum[2] = Integer.valueOf(end[2]);
		
		// 시작값 넣기
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, startNum[0]);
		calendar.set(Calendar.MONTH, startNum[1]);
		calendar.set(Calendar.DAY_OF_MONTH, startNum[2]);

		int count = 0;
		boolean a = true;
		while (a) {
			// 마지막 날짜 넘으면 스탑
			if (calendar.get(Calendar.YEAR) == endNum[0] && calendar.get(Calendar.MONTH) == endNum[1]
					&& calendar.get(Calendar.DAY_OF_MONTH) > endNum[2]) {
				a = false;
				break;
			}
			// 주말 아니면 카운트
			if (calendar.get(Calendar.DAY_OF_WEEK) != 1 && calendar.get(Calendar.DAY_OF_WEEK) != 7) {
				count++;
			}
			// 확인용
			System.out.print(calendar.get(Calendar.YEAR) + "년 ");
			System.out.print(calendar.get(Calendar.MONTH) + 1 + "월 ");
			System.out.print(calendar.get(Calendar.DAY_OF_MONTH) + "일 ");
			dayOfWeek(calendar.get(Calendar.DAY_OF_WEEK));
			System.out.println("근무일수 : " + count);
			calendar.add(Calendar.DAY_OF_MONTH, 1);
		}
		return count;
	}

	public static void dayOfWeek(int num) {
		switch (num) {
			case 1:
				System.out.println("일");
				break;
			case 2:
				System.out.println("월");
				break;
			case 3:
				System.out.println("화");
				break;
			case 4:
				System.out.println("수");
				break;
			case 5:
				System.out.println("목");
				break;
			case 6:
				System.out.println("금");
				break;
			case 7:
				System.out.println("토");
				break;
			default:
		}
	}

	

}
