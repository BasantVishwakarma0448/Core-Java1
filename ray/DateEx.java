package ray;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy EEE hh:mm:ss");
		String str = sdf.format(d);
		
		System.out.println(str);
		
//		String a = "09/08/1999";
//		Date d1 = sdf.parse(a);
//		System.out.println(d1);
	}
}
