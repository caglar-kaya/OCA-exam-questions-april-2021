package solutions_051_075;

import java.time.LocalDate;

public class S_073 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2012, 1, 30);
		date.plusDays(10); // date = date.plusDays(10); // 2012-02-09
		System.out.println(date); // 2012-01-30
		
		// Date/Time objects are immutable like String objects.
		
	}

}
