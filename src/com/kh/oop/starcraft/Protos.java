package com.kh.oop.starcraft;

public class Protos {
	public String tribe;
	public String name;
	public int damage;
	public double speed;
	public int armor;
	public int shield;
	public int pullStamina;
	public int nowStamina;
	public int shieldStamina;
	public int attackRange;

	
	
	
	public void armorUp() {
		System.out.println("방업이 완료되었습니다.");
		armor += 1;
	}
	public void shieldUp() {
		System.out.println("쉴드업이 완료되었습니다.");
		shield += 1;
	}
}
