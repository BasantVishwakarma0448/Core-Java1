package in.co.AbstractClass;

public class Rectangle extends Shape{
	 private int width, length;
	 private double Area;
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	void area() {
		this.Area = length*width;
		System.out.println(Area);
	}
	 
}
