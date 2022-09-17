package ray;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class AgeEx {
	public static void main(String[] args) {
		LocalDate Today = LocalDate.of(2022, 06, 26);
		LocalDate DOB = LocalDate.of(1994, 03, 28);
		//Date diff = new Date();
		Period diff = Period.between(DOB, Today);
		System.out.println(diff.getYears()+" years\n"+diff.getMonths()+" Months\n"+diff.getDays()+" Days");
	}
}
