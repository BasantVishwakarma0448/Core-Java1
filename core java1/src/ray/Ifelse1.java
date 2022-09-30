package ray;

public class Ifelse1 {
	public static void main(String[] args) {
		int a=25, b=5;
		 String n = "-";
		int add=a+b;
		int sub=a-b, multi=a*b;
		double div=a/b;
		if(n=="+") {
			System.out.println(add);
		}
		else if(n=="-") {
			System.out.println(sub);
		}
		else if(n=="*") {
			System.out.println(multi);
		}
		else if(n=="/") {
			System.out.println(div);
		}
		else {
			System.out.println("Default");
		}
		
		
	}

}
