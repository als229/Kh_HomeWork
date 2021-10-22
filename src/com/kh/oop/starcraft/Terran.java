package com.kh.oop.starcraft;

public class Terran {

	public String tribe;
	public String name;
	public int damage;
	public double speed;
	public int armor;
	public int pullStamina;
	public int nowStamina;
	public boolean death = true;
	public int attackRange;

	public void beAttacked(int damage) {
		if(death) {

			if(nowStamina - damage >= damage ) {
				System.out.println("쾅!");
				nowStamina -= damage;
			}else {System.out.println("으악~");
			nowStamina = 0;
			death = !death;
			}
		}
	}

	public void heal () {
		if(death) {
			if(pullStamina-10 >= nowStamina) {
				nowStamina += 10;
				System.out.println("뾰로롱~");}
			else nowStamina = pullStamina;

		}
	}
}