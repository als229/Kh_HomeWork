package com.kh.practiceRoom.func;

import java.util.Scanner;

public class RealPractice04 {

	public void practice1() {
		
		// 정수 두개와 연사자를 입력받고 입력된 연산자에 따라 알맞은 결과를 출력!
		// 단, 해당 프로그램은 연산자 입력에 "exit"라는 값이 입력될 때까지 무한반복하며
		// exit가 입력되면 "프로그램을 종료합니다." 를 출력하고 종료합니다.
		// 또한 연산자가 나누기이면서 두번째 정수가 0으로 들어오면
		// "0으로 나눌 수 없습니다. 다시 입력해주세여ㅛ."를 출력하며,
		// 없는 연산자가 들어올 시 " 없는 연산자 입니다. 다시 입력해 주세요. " 라고 출력하고
		// 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
		
		
		//첫번째 과제
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print(" '*', '+', '/', '%', '-' 중 하나를 골라주세요(종료하시려면 exit를 입력해주세요) : ");
			String str = sc.nextLine();  // 연산자와 exit 를 받을 String
			char ch = str.charAt(0);  // 연산자 받을 변수 ch
			if(str.equals("exit")) {     // exit 입력하면 프로그램 종료
				System.out.println("프로그램을 종료합니다");
				break;
				}   // 프로그램 종료
			System.out.print("숫자를 입력해 주세요 : ");
			int num1 = sc.nextInt();   // 정수 하나
			System.out.print("숫자를 입력해 주세요 : ");
			int num2 = sc.nextInt();   // 정수 둘
			sc.nextLine();  // 개행문자를 없애 줄 빈 상자 nextLine
			
			double result = 0;  // 각 연산자 결과값을 받을 공간, int 로 받으면 '/'를 할때 강제형변환이 안됨
			
			if(!(ch == '+' || ch == '-' || ch =='*' || ch == '/' || ch == '%')) { // 이 연산자 이외의 것이 들어오면 잡아주는 조건식
				System.out.println("없는 연산자입니다 다시 입력해 주세요");
				continue;   // 컨티뉴로 다시 가장 가까운 반복문 시작으로 돌아감
			}else if((ch == '/' && num2 == 0)||(ch == '%' && num2 == 0)) {  // 두번째 받은 정수의 값이 0이면서 ch 값이'/' 나 '%'일때 잡아주는 조건식 
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해 주세요");
				continue;  //컨티뉴로 다시 가장 가까운 반복문 시작으로 돌아감
				
			}else if (ch == '+' || ch == '-' || ch =='*' || ch == '/' || ch == '%'){   // 연산자 값이 '+', '-', '*', '%', '/' 가 들어왔을때 돌아가는 조건식
				if(ch == '+') {
					result =(num1 + num2); // 결과값들을 result에 저장
				}else if(ch == '-') {
					result = (num1 - num2);
					
				}else if(ch == '*') {
					result = (num1 * num2);
					
				}else if(ch == '/') {
					result = ((double)num1 / num2); // '/'를 할때는 double로 받기 위해 강제형변환
					
				}else if(ch == '%') {
					result = (num1 % num2);
				}
//				System.out.println(num1 + " " + ch + " " + num2 + " = " + result ); // 이렇게 하면 '+', '-', '*'를 할때도 double 형으로 나온다
				
				if(ch == '/') {   // printf에서 실수는 '%f'로 받기 때문에 따로 if로 출력문을 따로 만들어줌
					System.out.printf("%d %c %d = %f%n", num1 , ch , num2, result);
				}else
				System.out.printf("%d %c %d = %d%n", num1 , ch , num2, (int)result); // '/' 외에 나머지 결과값을 출력할 출력문 double 에서 int는 강제형변환 가능!
			}
			
		}
		
	}
	public void practice2() {
		
		//  2번 공차 만들기 !!!
 		//	사용자로부터 시작 숫자와 공차를 입력 받아
		//	일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
		//	단, 출력되는 숫자는 총 10개입니다.
		//	* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
		//	ex) 2, 7, 12, 17, 22 …
		//   5   5   5   5
		
		// 출력 형식 :
		// 시작 숫자 : 4
		// 공차 : 3
		// 4 7 10 13 16 19 22 25.....
		
		
		// 2번 답 이상하게 헷갈렸네
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int startNum = sc.nextInt();  // 시작 숫자를 담을 startNum
		System.out.print("공차 : ");
		int gongCha = sc.nextInt();  // 공차값을 담을 gongCha
		
		for(int i = 1; i <= 10 ; i++ ) { // 출력되는 숫자는 총 10개니까 일단 10번 돌려주는 식을 만든다.
			
			startNum += gongCha;   // startNum = startNum + gongChar 와 같다 변수 startNum에 startNum + gongCha 를 저장해 준다는 뜻 
			                    //ex) startNum = 2 + 3 5가 저장되어 나오고 다음에는 5에는 5에 3 이 더해져서 8이 나오고 ... 이어진다          
			System.out.print(startNum + " ");
		}
	}
}
