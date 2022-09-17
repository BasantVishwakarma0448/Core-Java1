package ray;

public class String4 {
	public static void main(String[] args) {
	String s1 = "Hello my name is basant vishwakarma and im 23years old";
	char search = 'a';
	int count = 0;
	System.out.println(s1.length());
	for(int i=0; i<s1.length(); i++) {
		if(s1.charAt(i)==search)
			count++;
	}
	System.out.println("The character " + search + " appears " + count + " times");
	}
}
