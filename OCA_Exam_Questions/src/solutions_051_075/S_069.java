package solutions_051_075;

public class S_069 {

	public static void main(String[] args) {
		
		String[][] chs = new String[5][2];
		chs[0] = new String[2];
		chs[1] = new String[5];
		
		int i = 97;
		
		System.out.println("\nBegining i : " + i);
		
		for (int a = 0; a < chs.length; a++) {
			for (int b = 0; b < 2; b++) { // b < chs.length
				chs[a][b] = "" + i;
				// java.lang.ArrayIndexOutOfBoundsException: 2
				i++;
			}
		}
		
		for (String[] ca : chs) {
			for (String c : ca) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nEnding i : " + i);
	}

}
