package com.kh.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {

	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return "면적 : " + r.getX() + ", " + r.getY() + ", " + r.getHeight() + ", " + r.getWidth() + " / " + (r.getHeight() * r.getWidth());
	}
	
	public String calcPerimeter(int x , int y, int height ,int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return "면적 : " + r.getX() + ", " + r.getY() + ", " + r.getHeight() + ", " + r.getWidth() + " / " + (2 * (r.getHeight() + r.getWidth()));
	}
}
