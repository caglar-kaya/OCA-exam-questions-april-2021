package solutions_026_050;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S_028 {

	public static void main(String[] args) {

		String[] arr = {"Hi", "How", "Are", "You"}; // "Hi".length() = 2
		List<String> arrList = new ArrayList<String>(Arrays.asList(arr));
		if (arrList.removeIf(s -> { System.out.println(s); return s.length() <= 2;} )) {
			System.out.println(" removed");
		}
		System.out.println(arrList); // [How, Are, You]
		
		System.out.println("\n********************\n");
		
		String[] arr2 = {"Hii", "How", "Are", "You"}; // "Hii".length() = 3
		List<String> arrList2 = new ArrayList<String>(Arrays.asList(arr2));
		if (arrList2.removeIf(s -> { System.out.println(s); return s.length() <= 2;} )) {
			System.out.println(" removed");
		}
		System.out.println(arrList2); // [Hii, How, Are, You]
	}

}
