package ray;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Year {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		for(int i=0; i<12; i++) {
			cal.add(Calendar.DAY_OF_YEAR, 30);
			Date d = cal.getTime();
			//System.out.println(d2);
			SimpleDateFormat d3 = new SimpleDateFormat("EEE dd/MMM/yyyy");
			String d4 = d3.format(d);
			System.out.println(d4);
		}
		
	}
}
