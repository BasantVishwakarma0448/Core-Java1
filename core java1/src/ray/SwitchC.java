package ray;

public class SwitchC {
	public static void main(String[] args) {
		int a=24, b=2, n=6;
		int add=a+b, sub=a-b, multi=a*b;
		double div=a/b;
		switch(n) {
		case 1:
			System.out.println(add);
			break;
		case 2:
			System.out.println(sub);
			break;
		case 3:
			System.out.println(multi);
			break;
		case 4:
			System.out.println(div);
			break;
			default:
				System.out.println("This is Default");
		}
		
	}
}
