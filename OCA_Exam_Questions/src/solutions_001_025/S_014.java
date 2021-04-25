package solutions_001_025;

public class S_014 {

	public static void main(String[] args) {

		String str = "Sweet Sweat";
		String str2 = str.trim().charAt(6) + "" + str.indexOf("Sw", 1);
		System.out.println(str2); // S6
		System.out.println(str.indexOf("Sw")); // 0
		System.out.println(str.indexOf("Sw", 1)); // 6
	}

}
