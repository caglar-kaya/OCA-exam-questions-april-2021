package solutions_101_125;

public class S_108 {

	public static void main(String[] args) {

		String [] arr = {"A", "B", "C", "D"};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (arr[i].equals("D")) {
				System.out.println("Work done");
				break;
			}
			
			continue;
		}
	}

}
