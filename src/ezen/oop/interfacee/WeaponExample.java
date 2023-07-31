package ezen.oop.interfacee;

public class WeaponExample {

	public static void main(String[] args) {
		// 인터페이스도 추상클래스처럼 객체 생성은 안되지만 타입으로는 선언 가능
//		Weapon weapon = new Gun();
//		weapon.attack();
//		
//		weapon = new Sword();
//		weapon.attack(); // 추상클래스랑 무슨차이지 (인터페이스는 부모자식관계가 아니다!)
//		
//		weapon = new Club();
//		weapon.attack();
		
		
		Unit unit = new Unit("marine", new Gun());
		unit.offence();
		
		unit.setWeapon(new Sword());
		unit.offence();
		
		unit.setWeapon(new Club());
		unit.offence();
		
		


	}

}
