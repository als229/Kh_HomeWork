package com.kh.practice.model.vo;

public class Child extends Parent {
	private int z;
	
	Child(){}
	
	Child(int x, int y, int z){
		super(x, y);
		this.z= z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
}
