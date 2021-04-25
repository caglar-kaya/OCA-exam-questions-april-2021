package solutions_026_050;

public class S_035 {

	public static void main(String[] args) {
		// boolean opt = true;
		
		// Cannot switch on a value of type boolean. 
		//Only convertible int values, strings or enum variables are permitted
		
		String opt = "true";
		
		switch (opt) {
		case "true":
			System.out.print("True");
			break;
		default:
			System.out.println("***");
		}
		System.out.println("Done");
	}

}
