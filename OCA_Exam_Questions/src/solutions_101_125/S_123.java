package solutions_101_125;

class App3 {
	
	String myStr = "9009";
	
	public void doStuff(String str) {
		int myNum = 0;
		try {
			String myStr = str;
			myNum = Integer.parseInt(myStr);
		} catch (NumberFormatException ne) {
			System.err.println("Error");
		}
		System.out.println(
				"myStr: " + myStr + ", myNum: " + myNum);
	}
	
}

public class S_123 {

	public static void main(String[] args) {
		App3 obj = new App3();
		obj.doStuff("7007");
	}

}
