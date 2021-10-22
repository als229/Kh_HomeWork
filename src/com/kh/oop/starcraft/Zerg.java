package com.kh.oop.starcraft;

public class Zerg {
	
	public String tribe;
	public String name;
	public int damage;
	public double speed;
	public int armor;
	public int nowStamina;
	public int attackRange;
	public boolean burrow = true;
	public String nowPosition;
	
	public void burrowUpDown(boolean burrow) {
		if(burrow) {
			System.out.println("쏙~");
			System.out.println("현재 버러우 중입니다.");
			burrow = !burrow;
		}

		else System.out.println("뿅!\n나왔습니다.");
	}
	public void damageup() {
		System.out.println("공업이 완료되었습니다.");
		damage += 1;
	}

}
