package ray;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateOther {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sb = new SimpleDateFormat ("E dd|MM|yy");
		String st = sb.format(d);
		System.out.println(st);
   }
}
