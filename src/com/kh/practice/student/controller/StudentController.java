package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	public static final int CUT_LINE = 60;
	
	private Student[] sArr = new Student[5];
	
	public StudentController() {
		
		this.sArr[0] = new Student("김길동", "자바", 100);
		this.sArr[1] = new Student("박길동", "디비", 50);
		this.sArr[2] = new Student("이길동", "화면", 85);
		this.sArr[3] = new Student("정길동", "서버", 60);
		this.sArr[4] = new Student("홍길동", "자바", 20);
	}
	
	public Student[] printStudent() {
		return this.sArr;
	}
	
	public int sumScore() {
		int sum = 0;
		for(int i = 0; i < sArr.length ; i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}
	
	public double avgScore() {
		
		return this.sumScore()/this.sArr.length;
	}

	public Student[] getsArr() {
		return sArr;
	}

	public void setsArr(Student[] sArr) {
		this.sArr = sArr;
	}

	public static int getCutLine() {
		return CUT_LINE;
	}
	
	
	
}
