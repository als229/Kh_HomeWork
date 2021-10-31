package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		while(true) {
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 " + "명 입니다.");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 " + "명입니다.");
		System.out.println("1. 학생 메뉴");
		System.out.println("2. 사원 메뉴");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		if(menuNum == 1) {
			StudentMenu();
		}else if(menuNum == 2){
			employeeMenu();
		}else if(menuNum == 9) {
			return;
		}
		}
	}
	public void StudentMenu() {
		int stopNum;
		while(true) {
			if(stopNum == 1) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 보기");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		if(stopNum == 1 && menuNum == 1) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			System.out.print("메뉴 번호 : ");
			menuNum = sc.nextInt();
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			continue;
		}
		if(menuNum == 1) {
			 if(pc.personCount() == 3) {
				 stopNum = menuNum;
				 System.out.println("학생을 담을수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			     continue;
			 }
			
			insertStudent();
		}else if(menuNum == 2){
			printStudent();
		}else if(menuNum == 9) {
			System.out.println("메인으로 돌아갑니다.");
			return;
		}
		}
		
	}
	public void employeeMenu() {
		int stopNum;
		while(true) {
			if(stopNum == 1) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		if(stopNum == 1 && menuNum == 1) {
			System.out.print("메뉴 번호 : ");
			menuNum = sc.nextInt();
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			continue;
		}
		if(menuNum == 1) {
			 if(pc.personCount() == 3) {
				 stopNum = menuNum;
				 System.out.println("사원을 담을수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원메뉴로 돌아갑니다.");
				 continue;
			 }
			 insertStudent();
		}else if(menuNum == 2){
			printStudent();
		}else if(menuNum == 9) {
			System.out.println("메인으로 돌아갑니다.");
			return;
		}
		}

	}
	public void insertStudent() {
		while(true) {
			System.out.print("학생 이름 : ");
			String name = sc.next();
			System.out.print("학생 나이 : ");
			int age = sc.nextInt();
			System.out.print("학생 키 : ");
			double height = sc.nextDouble();
			System.out.print("학생 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("학생 학년 : ");
			int grade = sc.nextInt();
			System.out.print("학생 전공 : ");
			String major = sc.next();

			pc.insertStudent(name, age, height, weight, grade, major);

			System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			String answer = sc.next();

			if(answer.equals("n") || answer.equals("N")) {
				System.out.println("학생 메뉴로 돌아갑니다.");
				return;
			}
			if(pc.personCount().length == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				return;
			}
		}
	}
	public void printStudent() {
		System.out.println(pc.printStudent());
	}
	public void insertEmployee() {
		while(true) {
			System.out.print("사원 이름 : ");
			String name = sc.next();
			System.out.print("사원 나이 : ");
			int age = sc.nextInt();
			System.out.print("사원 키 : ");
			double height = sc.nextDouble();
			System.out.print("사원 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("사원 학년 : ");
			int grade = sc.nextInt();
			System.out.print("사원 전공 : ");
			String major = sc.next();

			pc.insertEmployee(name, age, height, weight, grade, major);

			System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			String answer = sc.next();

			if(answer.equals("n") || answer.equals("N")) {
				System.out.println("사원 메뉴로 돌아갑니다.");
				return;
			}
			else if(pc.personCount().length == 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				return;
			}
		}
	}
	public void printEmployee() {
		System.out.println(pc.printEmployee());
	}

	
	
	
	
	
	
	
}
