package in.co.java.Exercise;

public class Rectangle extends shape{
	private double breadth, length;
	public void setb(double breadth) {
		this.breadth=breadth;
	}
	public void getb() {
		System.out.println("Breadth of rectangle is: " + breadth);;
	}
	public void setl(double length) {
		this.length=length;
	}
	public void getl() {
		System.out.println("Length of rectangle is: " + length);;
	}
	public void area() {
		double area=length*breadth;
		System.out.println("Area of rectangle is: " + area);
	}
}
