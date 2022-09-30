package in.co.java.Exercise;

public class Circle extends shape {
	private double radius;
	
	public void setr(double radius) {
		this.radius=radius;
	}
	public void getr() {
		System.out.println("Radius of circle is: " + radius);
	}
	public void area() {
		double area = 3.14*radius*radius;
		System.out.println(area);
	}
}
