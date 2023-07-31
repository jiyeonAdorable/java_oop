/*
 * 애플리케이션(Main) 클래스(실행하기 위한 클래스)
 */
public class DogExample {

	public static void main(String[] args) {
		// 위치상 지역변수(여기 안에서만 사용가능해), 기본 데이터 타입
		int age=50;
		
		// 메모리상에 Dog 인스턴스 생성
		
		// 위치상 지역변수, 레퍼런스데이터타입(참조자료형)......
		Dog dog; 				//데이터 타입이 클래스가 되었다.						//Dog 클래스를 dog라는 래퍼런스 변수로 선언..?
		
		
		//dog : 레퍼런스 변수 (바탕화면의 아이콘 같은 존재. 아이콘을 누르면 그 주소로 가서 실행)
		//Dog() : 디폴트 생성자 호출을 이용한 인스턴스 생성			// 크롬 = 크롬 아이콘 <- 이렇게 같다하는 것처럼 ......
		dog = new Dog(); // Dog 인스턴스가 만들어졌는데 dog에 할당하기에는 크기 때문에 인스턴스의 주소를 dog에 할당 (주소값 저장)
		System.out.println(dog.getName()); // 자동 초기화 됐기 때문에
		System.out.println(dog.getType()); // 기본 값이 저장되어있다.
		System.out.println(dog.getAge()); // null, null, 0
	
		
		
		
		Dog dog2 = new Dog(); //한번에 하기
		
		//인스턴스의 속성(상태) 변경(설정)
//		dog.name="나리";
//		dog.type="포메";       // 캡슐화 안된 상태.(정보은닉이 안됨. 너무 직접적으로 하고 있음) private 하고 세터게터까지하면 은닉!
//		dog.age=0;
//		
//		dog2.name="루니";
//		dog2.type="비숑";
//		dog2.age=8;
//		
		dog2.setName("루니");
		dog2.setType("비숑");
		dog2.setAge(8);
		
		// 생성자 이용해서 만들기
		dog = new Dog("나리", "포메", 0);
		dog2 = new Dog("루니", "비숑", 8);
		
		Dog dog3 = new Dog("두리","토이푸들");
				
		
		
		dog.bark();
		
		System.out.println(dog2.getName()+"가 먹습니다."); //여기서 name 쓰기
		
		dog2.eat();
		
		dog3.bark();
		System.out.println(dog3.getName()); // 나이 초기화 안했는데 0이 나오네 (JVM이 자동 초기화 시킴)
		

	}

}
