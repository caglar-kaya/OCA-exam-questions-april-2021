package solutions_126_150;

public class S_142 {

	public static void main(String[] args) {
		int wd = 0;
		String days[] = {"sun", "mon", "wed", "sat"};
		for (String s : days) {
			switch (s) {
			case "sat":
			case "sun":
				wd -= 1;
				break;
			case "mon":
				wd -= 1;
				break;
			case "wed":
				wd += 2;
				break;
			}
		}
		System.out.println(wd);
	}

}
