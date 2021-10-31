package com.kh.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int personNum[] = new int[1];
		for(int i = 0; i < e.length; i++) {
			if(s[i] == null) {
				personNum[i] = i;
				break;
			}
		}
		return personNum;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i = 0; i < s.length; i++) {
			s[i].setName(name);
			s[i].setAge(age);
			s[i].setHeight(height);
			s[i].setWeight(weight);
			s[i].setGrade(grade);
			s[i].setMajor(major);
		}
	}
	
	public Student[] printStudent() {
		
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		
	}
	
	public Employee[] printEmployee();
	
	
}
