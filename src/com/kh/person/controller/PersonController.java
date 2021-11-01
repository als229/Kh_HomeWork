package com.kh.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

	public int[] personCount() {
		int personSENum[] = new int[2];
		int sCount = 0;
		int eCount = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i] != null) {
				sCount++;
			}
			if(e[i] != null) {
				eCount++;
			}
		}
		personSENum[0] = sCount;
		personSENum[1] = eCount;
		return personSENum;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i = 0; i < s.length; i++) {
			if(s[i] == null) {
				//				s[i].setName(name);
				//				s[i].setAge(age);
				//				s[i].setHeight(height);
				//				s[i].setWeight(weight);
				//				s[i].setGrade(grade);
				//				s[i].setMajor(major);    이렇게 하면 s[0] 배열을 생성하지도 않고 그냥 바로 set하려고해서 오류남 저거는 초기화가 아직 되지않은
				//										 배열이기 때문에 new로 일일이 초기화를 해주면서 해야한다 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				s[i] = new Student(name, age, height, weight, grade, major);
				/*if(i == s.length) {
					System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생메뉴로 돌아갑니다.");
				}*/
				break;

			}
		}
	}

	public Student[] printStudent() {
		return s;
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i = 0; i < e.length; i++) {
			if(e[i] == null) {
				//			e[i].setName(name);
				//			e[i].setAge(age);
				//			e[i].setHeight(height);
				//			e[i].setWeight(weight);
				//			e[i].setSalary(salary);
				//			e[i].setDept(dept);    여기서도!!!!!!!!!!!!! 아오
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break;

			}
		}
	}

	public Employee[] printEmployee() {
		return e;	
	}


}
