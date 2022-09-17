package ray;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Basant Vishwakarma ";
		System.out.println(s1);
		System.out.println(s1.length());
		//System.out.println(s1.trim());
		//System.out.println(s1.isBlank());
		System.out.println(s1.codePointBefore(6));
		System.out.println(s1.codePointAt(10));
		System.out.println(s1.endsWith("a"));
		System.out.println(s1.charAt(16));
		System.out.println(s1.indexOf("m"));
	}

}
