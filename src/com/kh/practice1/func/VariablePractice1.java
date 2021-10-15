package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	// 클래스명 : VariablePractice1
	// 메인메소드를 제외한 모든 메소드 이 클래스에 작성
	// 
	
	// 1번 문제
	// 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
	// ex. 
	// 첫 번째 정수 : 23
	// 두 번째 정수 : 7
	//
	// 더하기 결과 : 30
	// 빼기 결과 : 16
	// 곱하기 결과 : 161
	// 나누기 몫 결과 : 3
	
	//1번답
	public void calculator() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 두개를 입력해 주세요^^ : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 결과 : " + (num1 / num2));
	}
	
	
	// 2번 문제
	// 키보드로 가로, 세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
	// 계산공식 ) 면적 : 가로 * 세로
	//         둘레 : (가로 + 세로) * 2
	// ex.
	// 가로 : 13.5
	// 세로 : 41.7
	//
	// 면적 : 562.95
	// 둘레 : 110.4
	
	// 2번 답
	public void quadrangle() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로의 길이를 입력해주세요 ^^ : ");
		double width = sc.nextDouble();
		
		System.out.print("세로의 길이를 입력해주세요 ^^ : ");
		double column = sc.nextDouble();
		
		System.out.println("면적 : " + (width * column));
		System.out.println("둘레 : " + ((width + column) * 2));
		
	}
	
	
	// 3번 문제
	// 영어 알파벳 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
	//
	// ex. 
	// 문자열을 입력하세요 : apple
	//
	// 첫 번째 문자 : a
	// 두 번째 문자 : p
	// 세 번쨰 문자 : p
	
	
	//3번 답
	public void char123() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어 단어를 입력해주세요 ^^ : ");
		
		String word = sc.nextLine();
		
		char first = word.charAt(0);
		char second = word.charAt(1);
		char third = word.charAt(2);
		
		System.out.println("첫 번째 문자 : " + first);
		System.out.println("두 번째 문자 : " + second);
		System.out.println("세 번째 문자 : " + third);
		
	}
	
	
	
	// 4번 문제
	// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
	//
	// ex.
	// 이름 : 이승철
	// 학년(숫자만) : 3
	// 반(숫자만) : 4
	// 번호(숫자만) : 15
	// 성적(소수점 아래 둘째자리까지) : 85.75
	
	//3학년 4반 15번 이승철 남학생의 성적은 85.75이다.
	
	
	//4번 답
	public void scoreCard () {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 알려주세요 ^^ : ");
		String name = sc.next();
		
		System.out.print("몇 학년이신가요?^^ : ");
		int grade = sc.nextInt();
		
		System.out.print("몇 반이세요? ^^ : ");
		int group = sc.nextInt();
		
		System.out.print("몇 번이세요? ^^ : ");
		int number = sc.nextInt();

		System.out.print("몇 점이세요? ^^ : ");
		double score = sc.nextDouble();

		System.out.printf("%d학년 %d반 %d번 %s 남학생의 성적은 %.2f이다." , grade, group, number, name, score );
		
	
	}

}













