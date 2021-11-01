package com.kh.funnygame;

import java.util.Scanner;

public class FunnyGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int tCount = 0;
		int fCount = 0;
		int qCount = 1;
		int input = 0;


		System.out.println("~~~~~~~~~~ 재미있는 삼칙연산 게임 ~~~~~~~~~~");
		System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 누르세요 ~]");
		System.out.println("# 엔터를 누르면 시작합니다!!!!!");
		System.out.println("===============================\n\n");

		System.out.println("# 난이도를 입력하세요! [상, 중, 하]");

		System.out.print(">> ");
		String step = sc.next();

		if(step.equals("상")){

			System.out.println("상급 난이도 입니다. 1 ~ 1000 범위로 출제됩니다.");
			while(true) {
				int rNum = (int)(Math.random()*3);
				int num1 = (int)(Math.random()*1000)+1;
				int num2 = (int)(Math.random()*1000)+1;

				if(rNum == 0) {
					System.out.printf("Q%d) %d x %d = ?\n", qCount, num1, num2);
					System.out.print(">> ");
					input = sc.nextInt();
					result = num1 * num2;
					qCount++;
					if(input == result && input != 0) {
						System.out.println("# 정답입니다!");
						tCount++;
					}else if(input != result && input != 0){
						System.out.println("# 오답입니다!");
						fCount++;
					}else if(input == 0) {
						System.out.println("========================");
						System.out.printf("# 정답 횟수 : %d회, 오답 횟수 : %d회", tCount, fCount);
						return;
					}
				}else if(rNum == 1){

					System.out.printf("Q%d) %d + %d = ?\n", qCount, num1, num2);
					System.out.print(">> ");
					input = sc.nextInt();
					result = num1 + num2;
					qCount++;
					if(input == result && input != 0) {
						System.out.println("# 정답입니다!");
						tCount++;
					}else if(input != result && input != 0){
						System.out.println("# 오답입니다!");
						fCount++;
					}else if(input == 0) {
						System.out.println("========================");
						System.out.printf("# 정답 횟수 : %d회, 오답 횟수 : %d회", tCount, fCount);
						return;
					}
				}else if(rNum == 2){

					System.out.printf("Q%d) %d - %d = ?\n", qCount, num1, num2);
					System.out.print(">> ");
					input = sc.nextInt();
					result = num1 - num2;
					qCount++;
					if(input == result && input != 0) {
						System.out.println("# 정답입니다!");
						tCount++;
					}else if(input != result && input != 0){
						System.out.println("# 오답입니다!");
						fCount++;
					}else if(input == 0) {
						System.out.println("========================");
						System.out.printf("# 정답 횟수 : %d회, 오답 횟수 : %d회", tCount, fCount);

						return;
					}
				}
			}
		}else if(step.equals("중")) {		

			System.out.println("중급 난이도 입니다. 1 ~ 100 범위로 출제됩니다.");
			while(true) {
				int rNum = (int)(Math.random()*3);
				int num1 = (int)(Math.random()*100)+1;
				int num2 = (int)(Math.random()*100)+1;

				if(rNum == 0) {
					System.out.printf("Q%d) %d x %d = ?\n", qCount, num1, num2);
					System.out.print(">> ");
					input = sc.nextInt();
					result = num1 * num2;
					qCount++;
					if(input == result && input != 0) {
						System.out.println("# 정답입니다!");
						tCount++;
					}else if(input != result && input != 0){
						System.out.println("# 오답입니다!");
						fCount++;
					}else if(input == 0) {
						System.out.println("========================");
						System.out.printf("# 정답 횟수 : %d회, 오답 횟수 : %d회", tCount, fCount);
						return;
					}
				}else if(rNum == 1){

					System.out.printf("Q%d) %d + %d = ?\n", qCount, num1, num2);
					System.out.print(">> ");
					input = sc.nextInt();
					result = num1 + num2;
					qCount++;
					if(input == result && input != 0) {
						System.out.println("# 정답입니다!");
						tCount++;
					}else if(input != result && input != 0){
						System.out.println("# 오답입니다!");
						fCount++;
					}else if(input == 0) {
						System.out.println("========================");
						System.out.printf("# 정답 횟수 : %d회, 오답 횟수 : %d회", tCount, fCount);
						return;
					}
				}else if(rNum == 2){

					System.out.printf("Q%d) %d - %d = ?\n", qCount, num1, num2);
					System.out.print(">> ");
					input = sc.nextInt();
					result = num1 - num2;
					qCount++;
					if(input == result && input != 0) {
						System.out.println("# 정답입니다!");
						tCount++;
					}else if(input != result && input != 0){
						System.out.println("# 오답입니다!");
						fCount++;
					}else if(input == 0) {
						System.out.println("========================");
						System.out.printf("# 정답 횟수 : %d회, 오답 횟수 : %d회", tCount, fCount);

						return;
					}
				}
			}
		}else if(step.equals("하")) {		

			System.out.println("중급 난이도 입니다. 1 ~ 20 범위로 출제됩니다.");
			while(true) {
				int rNum = (int)(Math.random()*3);
				int num1 = (int)(Math.random()*20)+1;
				int num2 = (int)(Math.random()*20)+1;

				if(rNum == 0) {
					System.out.printf("Q%d) %d x %d = ?\n", qCount, num1, num2);
					System.out.print(">> ");
					input = sc.nextInt();
					result = num1 * num2;
					qCount++;
					if(input == result && input != 0) {
						System.out.println("# 정답입니다!");
						tCount++;
					}else if(input != result && input != 0){
						System.out.println("# 오답입니다!");
						fCount++;
					}else if(input == 0) {
						System.out.println("========================");
						System.out.printf("# 정답 횟수 : %d회, 오답 횟수 : %d회", tCount, fCount);
						return;
					}
				}else if(rNum == 1){

					System.out.printf("Q%d) %d + %d = ?\n", qCount, num1, num2);
					System.out.print(">> ");
					input = sc.nextInt();
					result = num1 + num2;
					qCount++;
					if(input == result && input != 0) {
						System.out.println("# 정답입니다!");
						tCount++;
					}else if(input != result && input != 0){
						System.out.println("# 오답입니다!");
						fCount++;
					}else if(input == 0) {
						System.out.println("========================");
						System.out.printf("# 정답 횟수 : %d회, 오답 횟수 : %d회", tCount, fCount);
						return;
					}
				}else if(rNum == 2){

					System.out.printf("Q%d) %d - %d = ?\n", qCount, num1, num2);
					System.out.print(">> ");
					input = sc.nextInt();
					result = num1 - num2;
					qCount++;
					if(input == result && input != 0) {
						System.out.println("# 정답입니다!");
						tCount++;
					}else if(input != result && input != 0){
						System.out.println("# 오답입니다!");
						fCount++;
					}else if(input == 0) {
						System.out.println("========================");
						System.out.printf("# 정답 횟수 : %d회, 오답 횟수 : %d회", tCount, fCount);

						return;
					}
				}
			}
		}

	}
}