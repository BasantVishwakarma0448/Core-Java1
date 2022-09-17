package in.co.inheritance;

public class RectangleEx extends InheritanceEx {
	private int length, height;
	public int getlength() {
		return length;
	}
	public void setlength(int length) {
		this.length=length;
	}
	public int getheight() {
		return height;
	}
	public void setheight(int height) {
		this.height=height;
	}
	public double Area() {
		double area=length*height;
		System.out.println("Area of Rectangle: "+area);
		return 0;
	}
	}
	

