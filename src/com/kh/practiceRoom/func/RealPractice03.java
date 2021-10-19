package com.kh.practiceRoom.func;

import java.util.Scanner;

public class RealPractice03 {

	public static void main(String[] args) {
			gugudan();
	}
	public static void gugudan() {
		
		Scanner sc = new Scanner(System.in);
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		System.out.println("구구단 하고 싶은 숫자를 주세용");
		int num = sc.nextInt();
		// 구구단 할 숫자 num 에 입력
		System.out.println("====" + num + "단====");
		// 구구단 나오기 전에 먼저 출력
		for(int i = 1; i <= 9; i++) {
			// 출력 형식 ex)
			// 숫자 : 3
			// ===== 3단 =====
			// 3 * 1 = 3 
			// 3 * 2 = 6 
			// 9단까지
			System.out.printf("%d * %d = %d%n", num, i, (num * i));
		}
	}
}
