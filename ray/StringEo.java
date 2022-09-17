package ray;

public class StringEo {
	public static void main(String[] args) {
		String s1 = "Basant";
		String s2 = "Basant";
		boolean result3 =(s1==s2);
		boolean result4 = (s1.equals(s2));
		System.out.println(result3);
		System.out.println(result4);
		
		String s3 = new String("Ram");
		String s4 = new String("Ram");
		boolean result1 = (s3==s4); //this is for checking variable referance
		
		boolean result2 = (s3.equals(s4)); //This is for checking the values intialize in variable
		System.out.println(result1);
		System.out.println(result2);
	}
}
