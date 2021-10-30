package com.kh.practice.point.model.vo;

public class Point {
	private int x;
	private int y;
	
	public Point() {}

	public Point(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "x 좌표 : " + x + "\ny 좌표 : " + y;
	}
	
	
}