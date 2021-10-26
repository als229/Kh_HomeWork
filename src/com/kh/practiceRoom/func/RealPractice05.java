package com.kh.practiceRoom.func;

import java.util.Arrays;
import java.util.Scanner;

public class RealPractice05 {
	//  1번 문제 !

	//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	//	1~10 사이의 난수를 발생시켜 배열에 초기화 후
	//	배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
	//	ex.
	//	5 3 2 7 4 8 6 10 9 10
	//	최대값 : 10
	//	최소값 : 2

	// 1번 답 1시간
	public void maxMin() {  // 해매다가 1시간 걸림 흐름을 잘 생각하면서 해라 멍청아
		int[] arr = new int[10]; // 10칸 배열 arr 생성 
		
		for(int i = 0; i < arr.length; i++) {  // 0 ~ 9 까지나오는 i 조건식
			arr[i] = (int)(Math.random()*10)+1;  // arr에 1 ~ 10까지의 난수 입력
		}
		int max = arr[0];   // 이거 때문에 한시간 삽질 얘내의 위치를 잘 생각하면서 해라 
		int min = arr[0];   // 렌덤값으로 만들어진 배열 인덱스 0에 있는 값을 min max 에 일단 초기화
		for(int j = 0; j < arr.length; j++) {  // 0부터 9까지 돌릴 i 조건식
			if(max < arr[j]) max = arr[j];  // max보다 크면 max 에 담아진다
			if(min > arr[j]) min = arr[j];  // min 보다 작으면 min에 담아진다
		//	=> else if 로도 가능 !!
		}
		System.out.println(Arrays.toString(arr));  //배열 뽑기
		System.out.println("최대값 : " + max); //최대값 뽑기
		System.out.println("최소값 : " + min); //최소값 뽑기

		/* max랑 min 초기화를 for 안에서 하니까 계속 0이 들어가서 최소값이 0만 찍혔다.
		 * 값도 계속 0번째 값이 다시 들어가서 이상하게 나왔다. 생각좀 하면서 하자
		 * 
		 * 난이도는 적당했던 것 같습니다 !! 재미있습니다
		 */
		
	}


	// 2번 문제 !

	//	로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 출력하세요.
	//	ex.
	//	39 1 41 34 2 27
	
	// 2번 답  30분
	
	public void lotto() {  // lotto 메서드 생성
		int[] ballNum = new int[6];  // 로또공 중에서 뽑은 6개를 담을 배열 num
		
		for(int i = 0; i < ballNum.length; i++) { // 0 ~ 44 까지 나오는 i 조건식
			ballNum[i] = (int)(Math.random()*45)+1; // 6개짜리 배열인 ballNum에 렌덤값 입력!
			for(int j = 1; j < i; j++){ // 중복제거를 해주기 위한 코드! 
				if(ballNum[i] == ballNum[j]) { // 두개가 같으면 내려감
					i--; // i를 하나 빼주고 
					break; // break 로 나가서 다시 숫자 하나를 뽑게 한다!
				}
			}
		}
		System.out.println(Arrays.toString(ballNum) + " ");
	}

	/*
	 * 난이도 좋습니다 ! 재미있었습니다!
	 * 
	 */


	//	3번 문제 !

	//	문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
	//	문자의 개수와 함께 출력하세요.
	//	ex.
	//	문자열 : application
	//	문자열에 있는 문자 : a, p, l, i, c, t, o, n
	//	중복되지 않는 문자 개수 : 8
	
	
	// 3번 답 2시간 반
	public void splling() {   //중복 스팰링을 지우는 메서드
		int count = 0;  // 빈공간 숫자를 넣은 count
		String str = "";  // 빈공간을 뺀 char 들을 담을 String
		
		Scanner sc = new Scanner(System.in);
		
 		String text = sc.next();   // 일단 단어를 입력받을 text  
		char[] word = new char[text.length()];  //char 배열 word를 만든다 길이는 text의 길이로!
		
		for(int i = 0; i < text.length(); i++) {  // 0 ~ 단어 길이의 i를 만두는 조건식
			word[i] = text.charAt(i); // => word배열에 char타입으로 단어가 힌개씩 입력됨. 헷갈리니까 일단 배열로 넣어주자
		}
		for(int j = 0; j < text.length(); j++) { // 들어온 text의 길이만큼 돌아가는 조건식
			for(int k = j+1; k < text.length(); k++) {  // k j+1로 해서 둘이 같아지는 일이 없게 했다.
				if(word[j] == word[k]) { //두개가 같으면 
					word[j] = ' '; // ' ' 빈공간으로 채우고 
					break;  // break 해서 밖으로 나간다
				}else {
					word[j] = text.charAt(j); // 두개가 같지 않을때는 word[j]에 글자가 채워진다.
				}
			}                                // 지금 여기서 뽑으면[ ,  , p, l,  , c, a, t, i, o, n] 이렇게 나온다
		}
		for(int i =0; i < word.length; i++) {  // word 길이만큼 반복하는 조건식
			if(word[i] == ' ') {  // word 에 ' ' 이 나오면
				count += 1;   // 카운트를 하나 올려주면서 
				continue;  // continue 로 밑에를 건너 뛰고 돌아간다
			} str += word[i];  // 공백이 아닐때는 str에 word 배열의 값들이 String 으로 전환되게 모아줬다.
		}
		
		char[] answer = new char[text.length()-count];  // 새로운 배열 answer 배열을 만든다. 길이는 text에서 카운트된 공백수 만큼 빼줬다.
		for(int i =0; i < answer.length; i++) {   // answer의 길이만큼 반복하는 조건식
			answer[i] = str.charAt(i);  // answer 배열에 str의 글자들을 다시 담았다.
		}
		
		System.out.println("문자열 : " + text);
		System.out.println(Arrays.toString(answer)); // answer 출력
		System.out.println("문자 개수 : " + answer.length  )  ;
	}
	/*
	 * 
	 *어려웠습니다 근데 재미있었습니다 ~ 
	 * 
	 * 
	 * 고생하셨습니다. 
	 *
	 */
	
	
	//3번 선생님 답

	public void method() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 > ");
		String str = sc.next();

		String result = "문자열에 있는 문자 : " + str.charAt(0) + " ";
		int count = str.length();   // 입력받은 문자열의 길이에서 중복된 문자의 갯수를 뺀 값

		// i 부터 문자열의 길이까지
		for(int i = 1; i <= str.length() -1 ; i++) {
			// 반복문으로 charAt(i) 번째 인덱스와 charAt(j)번째 인덱스까지 비교
			for(int j = 0; j <= i-1; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count--;
					break;
				}else if(str.charAt(i) != str.charAt(j) && j == i-1) {
					result += str.charAt(i) + " ";
				}
			}
		}
		System.out.println(result);
		System.out.println("중복되지 않은 글자수 : " + count);
	}
}
