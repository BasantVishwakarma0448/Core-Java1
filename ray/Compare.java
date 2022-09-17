package ray;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Compare {
	public static void main(String[] args) {
		//int noOfdays = 14;
		 Calendar cal = Calendar.getInstance();
		 Date acal = cal.getTime();
		 cal.add(Calendar.DAY_OF_YEAR, 14);
		 Date date = cal.getTime();
		 SimpleDateFormat date2 =new SimpleDateFormat("EEE dd/MM/yyyy");
		 String d = date2.format(date);
		 System.out.println(acal);
		 System.out.println("\nDay after two weeks : "+ d);
		 
	}
}
