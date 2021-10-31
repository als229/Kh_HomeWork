package com.kh.hw.person.model.vo;

public class Employee extends Person{

	private int salary;
	private String dept;
	
	public Employee() {}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return super.getName() +"의 나이는 " + super.getAge() + "이고 키는 " + super.getHeight() + "cm 이고 몸무게는 " + super.getWeight() + "kg이고 월급은 " + salary + "이고 부서는 " + dept + "입니다 !";
	}
	
}
