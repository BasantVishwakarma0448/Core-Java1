package in.co.AbstractClass;

public class Circle extends Shape{
	private float radius; float Area;
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius=radius;
	}
	@Override
	void area() {
		this.Area = (float) (3.14*radius*radius);
		System.out.println(Area);
	}
	
}
