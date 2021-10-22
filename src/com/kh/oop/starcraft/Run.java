package com.kh.oop.starcraft;

public class Run {

	public static void main(String[] args) {

		Terran marine = new Terran();
		
		
		marine.tribe = "Terran";
		marine.name = "Marine";
		marine.damage = 6;
		marine.speed = 1.875;
		marine.armor = 0;
		marine.pullStamina = 40;
		marine.nowStamina = 40;
		marine.death = true;
		marine.attackRange = 4;
		System.out.println(marine.tribe + "종족의 " + marine.name + "의 현재 체력은 " + marine.nowStamina + "이고 이동속도는" + marine.speed + "이고 방어력은 " + marine.armor + "이고 공격력은 " + marine.damage + "이고 사정거리는 " + marine.attackRange + "입니다." );
		
		marine.beAttacked(10);
		System.out.println(marine.tribe + "종족의 " + marine.name + "의 현재 체력은 " + marine.nowStamina + "이고 이동속도는" + marine.speed + "이고 방어력은 " + marine.armor + "이고 공격력은 " + marine.damage + "이고 사정거리는 " + marine.attackRange + "입니다." );

		marine.heal();
		System.out.println(marine.tribe + "종족의 " + marine.name + "의 현재 체력은 " + marine.nowStamina + "이고 이동속도는" + marine.speed + "이고 방어력은 " + marine.armor + "이고 공격력은 " + marine.damage + "이고 사정거리는 " + marine.attackRange + "입니다." );
		
		marine.beAttacked(10);
		System.out.println(marine.tribe + "종족의 " + marine.name + "의 현재 체력은 " + marine.nowStamina + "이고 이동속도는" + marine.speed + "이고 방어력은 " + marine.armor + "이고 공격력은 " + marine.damage + "이고 사정거리는 " + marine.attackRange + "입니다." );
		marine.beAttacked(10);
		System.out.println(marine.tribe + "종족의 " + marine.name + "의 현재 체력은 " + marine.nowStamina + "이고 이동속도는" + marine.speed + "이고 방어력은 " + marine.armor + "이고 공격력은 " + marine.damage + "이고 사정거리는 " + marine.attackRange + "입니다." );
		marine.beAttacked(10);
		System.out.println(marine.tribe + "종족의 " + marine.name + "의 현재 체력은 " + marine.nowStamina + "이고 이동속도는" + marine.speed + "이고 방어력은 " + marine.armor + "이고 공격력은 " + marine.damage + "이고 사정거리는 " + marine.attackRange + "입니다." );
		marine.beAttacked(10);
		System.out.println(marine.tribe + "종족의 " + marine.name + "의 현재 체력은 " + marine.nowStamina + "이고 이동속도는" + marine.speed + "이고 방어력은 " + marine.armor + "이고 공격력은 " + marine.damage + "이고 사정거리는 " + marine.attackRange + "입니다." );
		
		Terran vulture = new Terran();
		
		vulture.tribe = "Terran";
		vulture.name = "Vulture";
		vulture.damage = 20;
		vulture.speed = 3.126;
		vulture.armor = 0;
		vulture.pullStamina = 80;
		vulture.nowStamina = 80;
		vulture.death = true;
		vulture.attackRange = 5;
		
		System.out.println(vulture.tribe + "종족의 " + vulture.name + "의 현재 체력은 " + vulture.nowStamina + "이고 이동속도는" + vulture.speed + "이고 방어력은 " + vulture.armor + "이고 공격력은 " + vulture.damage + "이고 사정거리는 " + vulture.attackRange + "입니다.");
		
		vulture.beAttacked(10);
		System.out.println(vulture.tribe + "종족의 " + vulture.name + "의 현재 체력은 " + vulture.nowStamina + "이고 이동속도는" + vulture.speed + "이고 방어력은 " + vulture.armor + "이고 공격력은 " + vulture.damage + "이고 사정거리는 " + vulture.attackRange + "입니다.");

		vulture.heal();
		System.out.println(vulture.tribe + "종족의 " + vulture.name + "의 현재 체력은 " + vulture.nowStamina + "이고 이동속도는" + vulture.speed + "이고 방어력은 " + vulture.armor + "이고 공격력은 " + vulture.damage + "이고 사정거리는 " + vulture.attackRange + "입니다.");

		Zerg hydralisk = new Zerg();

		hydralisk.tribe = "Zerg";
		hydralisk.name = "Hydralisk";
		hydralisk.damage = 10;
		hydralisk.speed = 1.741;
		hydralisk.armor = 0;
		hydralisk.nowStamina = 80;
		hydralisk.attackRange = 4;
		hydralisk.burrow = true;

		System.out.println(hydralisk.tribe + "종족의 " + hydralisk.name + "는 공격력은 " + hydralisk.damage + "이고 이동속도는"
				+ hydralisk.speed + "이며 방어력은 " + hydralisk.armor + "이고 현재 체력은 " + hydralisk.nowStamina + "이고 사정거리는 "
				+ hydralisk.attackRange + "입니다");

		hydralisk.burrowUpDown(true);
		hydralisk.burrowUpDown(false);

		hydralisk.damageup();
		System.out.println(hydralisk.tribe + "종족의 " + hydralisk.name + "는 공격력은 " + hydralisk.damage + "이고 이동속도는"
				+ hydralisk.speed + "이며 방어력은 " + hydralisk.armor + "이고 현재 체력은 " + hydralisk.nowStamina + "이고 사정거리는 "
				+ hydralisk.attackRange + "입니다");

		Zerg zergling = new Zerg();

		zergling.tribe = "Zerg";
		zergling.name = "Zergling";
		zergling.damage = 5;
		zergling.speed = 2.612;
		zergling.armor = 0;
		zergling.nowStamina = 35;
		zergling.attackRange = 1;
		zergling.burrow = true;

		System.out.println(zergling.tribe + "종족의 " + zergling.name + "는 공격력은 " + zergling.damage + "이고 이동속도는"
				+ zergling.speed + "이며 방어력은 " + zergling.armor + "이고 현재 체력은 " + zergling.nowStamina + "이고 사정거리는 "
				+ zergling.attackRange + "입니다");
		
		
		zergling.burrowUpDown(true);
		zergling.burrowUpDown(false);
		
		zergling.damageup();

		System.out.println(zergling.tribe + "종족의 " + zergling.name + "는 공격력은 " + zergling.damage + "이고 이동속도는"
				+ zergling.speed + "이며 방어력은 " + zergling.armor + "이고 현재 체력은 " + zergling.nowStamina + "이고 사정거리는 "
				+ zergling.attackRange + "입니다");
	
	
	Protos zealot = new Protos();
	
	
	zealot.tribe = "Protos";
	zealot.name = "Zealot";
	zealot.damage = 16;
	zealot.speed =  1.875;
	zealot.armor = 1;
	zealot.shield = 1;
	zealot.nowStamina = 100;
	zealot.shieldStamina = 60;
	zealot.attackRange = 1;

	
	System.out.println(zealot.tribe + "종족의 " + zealot.name + "의 공격력은 " + zealot.damage + "이고 이동속도는 " + zealot.speed + "이고 방어력은 " + 
			zealot.armor + "이고 쉴드방어력은 " + zealot.shield + "이고 체력은 " + zealot.nowStamina + "이고 쉴드량은 " + zealot.shieldStamina + "이고 사정거리는 " + zealot.attackRange + "이다.");
	
	zealot.armorUp();
	System.out.println(zealot.tribe + "종족의 " + zealot.name + "의 공격력은 " + zealot.damage + "이고 이동속도는 " + zealot.speed + "이고 방어력은 " + 
			zealot.armor + "이고 쉴드방어력은 " + zealot.shield + "이고 체력은 " + zealot.nowStamina + "이고 쉴드량은 " + zealot.shieldStamina + "이고 사정거리는 " + zealot.attackRange + "이다.");
	zealot.shieldUp();
	System.out.println(zealot.tribe + "종족의 " + zealot.name + "의 공격력은 " + zealot.damage + "이고 이동속도는 " + zealot.speed + "이고 방어력은 " + 
			zealot.armor + "이고 쉴드방어력은 " + zealot.shield + "이고 체력은 " + zealot.nowStamina + "이고 쉴드량은 " + zealot.shieldStamina + "이고 사정거리는 " + zealot.attackRange + "이다.");
	
	
	Protos dragoon = new Protos();
	
	dragoon.tribe = "Protos";
	dragoon.name = "Dragoon";
	dragoon.damage = 20;
	dragoon.speed =  2.461;
	dragoon.armor = 1;
	dragoon.shield = 1;
	dragoon.nowStamina = 100;
	dragoon.shieldStamina = 80;
	dragoon.attackRange = 4;

	
	System.out.println(dragoon.tribe + "종족의 " + dragoon.name + "의 공격력은 " + dragoon.damage + "이고 이동속도는 " + dragoon.speed + "이고 방어력은 " + 
			dragoon.armor + "이고 쉴드방어력은 " + dragoon.shield + "이고 체력은 " + dragoon.nowStamina + "이고 쉴드량은 " + dragoon.shieldStamina + "이고 사정거리는 " + dragoon.attackRange + "이다.");
	
	dragoon.armorUp();
	System.out.println(dragoon.tribe + "종족의 " + dragoon.name + "의 공격력은 " + dragoon.damage + "이고 이동속도는 " + dragoon.speed + "이고 방어력은 " + 
			dragoon.armor + "이고 쉴드방어력은 " + dragoon.shield + "이고 체력은 " + dragoon.nowStamina + "이고 쉴드량은 " + dragoon.shieldStamina + "이고 사정거리는 " + dragoon.attackRange + "이다.");
	dragoon.shieldUp();
	System.out.println(dragoon.tribe + "종족의 " + dragoon.name + "의 공격력은 " + dragoon.damage + "이고 이동속도는 " + dragoon.speed + "이고 방어력은 " + 
			dragoon.armor + "이고 쉴드방어력은 " + dragoon.shield + "이고 체력은 " + dragoon.nowStamina + "이고 쉴드량은 " + dragoon.shieldStamina + "이고 사정거리는 " + dragoon.attackRange + "이다.");
	
	
	
	
	
	
	}
	
	
}
