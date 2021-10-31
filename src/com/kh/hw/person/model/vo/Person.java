package com.kh.hw.person.model.vo;

public class Person {

	private String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {}
	
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return this.name +"의 나이는 " + this.age + "이고 키는 " + this.height + "cm 이고 몸무게는 " + this.weight + "kg 입니다!";
	}
}
