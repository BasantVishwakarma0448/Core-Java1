package in.co.AbstractClass;

public class Testshape {
	public static void main(String[] args) {
		Shape c = new Circle();
		Circle c2 = new Circle();
		c2.getRadius();
		c2.setRadius((float) 120.36);
		c2.area();
		c.setBW(45);
		System.out.println(c.getBW());
//		c2.setBW(12);
//		System.out.println(c2.getBW());
		Shape t = new Triangle();
		Triangle t2 = new Triangle();
		
		t2.setBase(12);
		t2.setheight(45);
		t2.getBase();
		t2.getheight();
		t.area();
		Shape r = new Rectangle();
		Rectangle r2 = new Rectangle();
		r2.getWidth();
		r2.getLength();
		r2.setWidth(12);
		r2.setLength(13);
		r.area();
	}
}
