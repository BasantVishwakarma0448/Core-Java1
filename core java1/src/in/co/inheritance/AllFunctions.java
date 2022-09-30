package in.co.inheritance;

public class AllFunctions {
	public static void main(String[] args) {
		CircleEx c = new CircleEx();
		RectangleEx e = new RectangleEx();
		
		c.setRadius(5);
		
		
		System.out.println(c.getRadius());
		//System.out.println(d);
		c.Area();
		
		e.setlength(12);
		e.setheight(10);
		 
		System.out.println("Length of Rectangle: "+e.getlength());
		System.out.println("Height of Rectangle: "+e.getheight());
		//System.out.println(a);
		e.Area();
		 InheritanceEx i = new CircleEx();
		 i.setbw(5);
		 
		 System.out.println(i.getbw());
	}
}
