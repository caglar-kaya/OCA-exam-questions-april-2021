package solutions_101_125;

import java.time.LocalDate;

public class S_105 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2012, 01, 32);
		date.plusDays(10);
		System.out.println(date.getDayOfWeek());
		
		// java.time.DateTimeException: 
		// Invalid value for DayOfMonth (valid values 1 - 28/31): 32
	}

}
