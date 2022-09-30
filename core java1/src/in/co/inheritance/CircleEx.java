package in.co.inheritance;

public class CircleEx extends InheritanceEx {
	private double radius;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double Area() {
		double area = 3.14*radius*radius;
		System.out.println(area);
		return 0;
	}
}
