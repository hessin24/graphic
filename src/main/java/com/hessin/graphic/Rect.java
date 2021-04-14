package com.hessin.graphic;


public class Rect {
	private float top, left, right, bottom;
	private float x, y;
	private Point point;
	public Rect(float top, float left, float right, float bottom) {
		this.top=top;
		this.left=left;
		this.right=right;
		this.bottom=bottom;
		this.point = new Point(top,left,right,bottom);
		this.x = left + right;
		this.y = top + bottom;
	
	}
	
	public Point getPoint() {
		return point;
	}
	
	public Rect(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public Rect(Point point) {
		this.top = point.top;
		this.left = point.left;
		this.right = point.right;
		this.bottom = point.bottom;
		this.x = left + right;
		this.y = top + bottom;
	}
	public Rect() {
		this.x = left + right;
		this.y = top + bottom;
	}
	
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	

}
