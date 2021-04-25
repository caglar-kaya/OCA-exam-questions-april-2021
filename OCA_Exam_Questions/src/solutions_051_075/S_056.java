package solutions_051_075;

public class S_056 {

	public static void main(String[] args) {

		String str = " ";
		str.trim(); // unreferenced / lost object
		System.out.println(str.equals("") + " " + str.isEmpty());
		
	}

}
