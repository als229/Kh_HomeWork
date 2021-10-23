package com.kh.oop.starcraft;

import java.util.Scanner;

public class Practice06 {
		
		public static void main(String[] args) {
			
//			spellingExplorer();
//			arrayPlus();
//			chickenOder();
			star();
		}
		
		
//		1번 문제 
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//		ex.
//		문자열 : application
//		문자 : i
//		application에 i가 존재하는 위치(인덱스) : 4 8 
//		i 개수 : 2
		
		//1번 답
		public static void spellingExplorer() {
			int count = 0;
			String point = "";
			
			Scanner sc = new Scanner(System.in);
			System.out.print("입력하고 싶은 단어를 입력하세용 ^^ : ");
			String text = sc.next();
			System.out.print("찾고싶은 스펠링을 입력하세용 ^^ : ");
			char ch = sc.next().charAt(0);
			char [] word = new char[text.length()];
			
			
			for(int i = 0; i <= word.length-1; i++) {
				word[i] = text.charAt(i);
				if(ch == word[i]) {
					count += 1;
					point += i + " ";
				}
			}
			System.out.println("문자열 : " + text);
			System.out.println("찾으신 스펠링 : " + ch);
			System.out.println(ch + "가 존재하는 위치(인덱스) : " + point);
			System.out.println(ch + "의 갯수 : " + count);
			
			
		}
	
		public static void  arrayPlus() {
//		2번 문제
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//		ex.
//		정수 : 5
//		배열 0번째 인덱스에 넣을 값 : 4
//		배열 1번째 인덱스에 넣을 값 : -4
//		배열 2번째 인덱스에 넣을 값 : 3
//		배열 3번째 인덱스에 넣을 값 : -3
//		배열 4번째 인덱스에 넣을 값 : 2
//		4 -4 3 -3 2 
//		총 합 : 2
			
			//2번 답
			int sum = 0;
			String str = "";
			Scanner sc = new Scanner(System.in);
			
			int [] arr = {4, -4, 3, -3, 2};
			
			System.out.println("정수 " + arr.length);
			for(int i = 0; i <= arr.length - 1; i++) {
				
				System.out.println("배열 " + i + "번째 인덱스에 넣을 값 : " + arr[i]);
				sum += arr[i];
				str += arr[i] + " ";
			}
			System.out.println(str);
			System.out.println("총 합 : " + sum);
		}
		
		
		public static void chickenOder() {
//		3번 문제
//		사용자가 입력한 값이 배열에 있는지 검색하여
//		있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//		단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
//		ex.
//		치킨 이름을 입력하세요 : 양념 치킨 이름을 입력하세요 : 불닭
//		양념치킨 배달 가능 불닭치킨은 없는 메뉴입니다.
		
			Scanner sc = new Scanner(System.in);
			
			String[] menu = {"양념", "자메이카통다리", "뿌링클", "황금올리브" };
			
			System.out.print("치킨 이름을 입력하세요 : ");
			String oder = sc.next();
			boolean bl = false;

			for(int i = 0; i <= menu.length - 1; i++) {
				if(oder.equals(menu[i])) {
					bl = !bl;
					break;
				}
			}
			if(bl) System.out.println(oder + "치킨 배달 가능!");
			else System.out.println(oder + "치킨은 없는 메뉴입니다...");

		}
		//		4번 문제
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//		****
//		***
//		**
//		*
		
		public static void star() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			
			for(int i = num; i >= 1; i--) {
				for(int j = 1 ; j <= i; j++) {
					System.out.print("*");
				}System.out.println();
			}
			
		}
}
		
		
	

