package com.kh.hw.person.model.vo;

public class Student extends Person{

	private int grade;
	private String major;
	
	public Student() {}
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.getName() +"의 나이는 " + super.getAge() + "이고 키는 " + super.getHeight() + "cm 이고 몸무게는 " + super.getWeight() + "kg 이고 " + this.grade + "학년이고 전공은 " + this.major + "입니다.! ";
	}
	
	
}
