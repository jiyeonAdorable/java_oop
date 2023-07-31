package ezen.oop.interfacee;
/**
 * 유닛이 사용하는 모든 무기들에 대한 역할(명세)을 정의
 * 인터페이스도 하나의 데이터 타입이다.
 * 인터페이스는 100% 추상메소드들로만 구성
 * @author 임지연
 *
 */
/*public*/ interface Weapon { // public 생략해도 컴파일 시 자동 생김
	
	// 인터페이스 변수는 무조건 상수로 처리됨(public static final 안써도 컴파일 시 자동 생김)
	/*public static final */int WEIGHT = 1;
	/*public abstract */ void attack(); //얘도 컴파일 시 자동 추상 메소드 됨

}
