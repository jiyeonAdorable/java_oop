package ezen.oop.array;
/*
 * 학생정보 추상화/캡슐화
 */
// 마커 인터페이스 ex) Cloneable
// 추상 메소드가 전혀 없는 멍텅구리 인터페이스
public class Student implements Cloneable{
	
	public static final String SCHOOL_NAME ="이젠초등학교";
	
	private int no;
	private String name;
	private int score;
	
	public Student() {}
	public Student(int no, String name, int score) {
		this.no = no;
		this.name =name;
		this.score = score;
	}
	
	
	public int getNo() { 
		return no;
	}
//	public void setNo(int no) { //학번 바꿀 필요 없으니까..
//		this.no = no;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	// 학생의 모든 정보 출력 기능
	public void printInfo() {
		System.out.println(getNo()+"\t"+getName()+"  "+getScore());
	}
	
	@Override
	public String toString() {
		return getNo()+"\t"+getName()+"  "+getScore();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student)obj;
			if(toString().equals(student.toString())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException { // 접근 제한자 확장
		return super.clone(); // Object의 clone 데려왔음
	}
	
	
	
	
	
	
}
