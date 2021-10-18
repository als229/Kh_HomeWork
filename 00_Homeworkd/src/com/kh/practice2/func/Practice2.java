package com.kh.practice2.func;

import java.util.Scanner;

public class Practice2 {
	
//	1. 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
//	그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
//	아니면 false를 출력하세요.
//	(단, num1은 num2보다 작아야 함)
	
//	ex.
//	정수1 : 4
//	정수2 : 11
//	입력 : 13
	
//	true
	
	public void method1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 하나 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("처음 이력한 정수보다 큰 정수를 하나 입력하세요");
		int num2 = sc.nextInt();
		System.out.println("아무 정수를 하나 입력하세요");
		int num3 = sc.nextInt();
		
		if(num3 <= num1 || num2 > num3) {
			System.out.println("false");
		}else
			System.out.println("true");
		
	}
	
//	2. 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
	
//	ex.
//	입력1 : 5
//	입력2 : -8
//	입력3 : 5
	
//	false
	
//	3. 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
//	짝수가 아니면 “홀수다“를 출력하세요.
//	양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
	
//	ex.
//	숫자를 한 개 입력하세요 : -8
//	양수만 입력해주세요.

//	4. 키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력(double)하세요.
//	(단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
//	“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
	
//	ex.
//	피연산자1 입력 : 15
//	피연산자2 입력 : 4
//	연산자를 입력(+,-,*,/,%) : /
//	15 / 4 = 3.75000


}
