package in.co.AbstractClass;

import in.co.java.Exercise.shape;

public class Triangle extends Shape {
	private int base, height;
	private double Area;
	public int getBase() {
		System.out.println("Base of the triangle is: "+base);
		return 0;
		
	}
	public void setBase(int Base) {
		this.base=Base;
	}
	public void getheight() {
		System.out.println("Height of the triangle is: "+height);
	}
	public void setheight(int Height) {
		this.height=Height;
	}
	@Override
	void area() {
		this.Area= 0.5*base*height;
		System.out.println(Area);
	}
}
