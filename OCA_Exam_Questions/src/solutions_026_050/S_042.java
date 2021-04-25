package solutions_026_050;

public class S_042 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Caglar");
		
		// sb.deleteAll(); 
		// The method deleteAll() is undefined for the type StringBuilder
		
		// sb.delete(0, sb.size());
		// The method size() is undefined for the type StringBuilder
		
		sb.delete(0, sb.length());
		
		// sb.removeAll();
		// The method removeAll() is undefined for the type StringBuilder
		
		System.out.println("Result of sb: " + sb);
	}

}
