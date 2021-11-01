package com.kh.funnygame;

import java.util.Scanner;

public class Calculator {
	private int result;
	private int tCount;
	private int fCount;
	private int qCount;
	private int input;
	Scanner sc = new Scanner(System.in);
	
	public Calculator() {}
	
	public Calculator(int result, int tCount, int fCount, int qCount, int input, Scanner sc, String step) {
		this.result = result;
		this.tCount = tCount;
		this.fCount = fCount;
		this.qCount = qCount;
		this.input = input;
		this.sc = sc;
		this.step = step;
	}

	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int gettCount() {
		return tCount;
	}
	public void settCount(int tCount) {
		this.tCount = tCount;
	}
	public int getfCount() {
		return fCount;
	}
	public void setfCount(int fCount) {
		this.fCount = fCount;
	}
	public int getqCount() {
		return qCount;
	}
	public void setqCount(int qCount) {
		this.qCount = qCount;
	}
	public int getInput() {
		return input;
	}
	public void setInput(int input) {
		this.input = input;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public String getStep() {
		return step;
	}
	public void setStep(String step) {
		this.step = step;
	}

	String step = sc.next();
	
	public void calulator() {
		if(step.equals("상")){

			System.out.println("상급 난이도 입니다. 1 ~ 1000 범위로 출제됩니다.");
			while(true) {
				int rNum = (int)(Math.random()*3);
				int num1 = (int)(Math.random()*1000)+1;
				int num2 = (int)(Math.random()*1000)+1;

				if(rNum == 0) {
					System.out.printf("Q%d) %d * %d = ?\n", qCount, num1, num2);
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
