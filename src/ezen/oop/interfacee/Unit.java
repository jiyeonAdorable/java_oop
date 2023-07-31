package ezen.oop.interfacee;

public class Unit {
	private String name;
	private Weapon weapon; // 타입을 인터페이스로... 어떤 무기를 쓸 지 모르니까 선언만..
	
	public Unit() {};
	public Unit(String name, Weapon weapon) {
		this.name  = name;
		this.weapon = weapon;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	
	
	@Override
	public String toString() {
		return "Unit [name=" + name + "]";
	}
	
	public void offence() { // 공격할 때 무기를 가지고 공격해야하니까 무기 속성이 있어야 한다.
		weapon.attack();
	}
	
	
	
	

}
