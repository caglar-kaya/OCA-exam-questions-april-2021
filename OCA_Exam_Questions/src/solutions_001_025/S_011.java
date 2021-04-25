package solutions_001_025;

public class S_011 {

	public static void main(String[] args) {

		String[] strs = {"A", "B"};
		int idx = 0;
		for (String s : strs) {
			strs[idx].concat(" element " + idx);
			idx++;
		}
		System.out.println(idx); // 2
		for (idx = 0; idx < strs.length; idx++) {
			System.out.print(strs[idx]);
		}
		// Output: AB
	}

}
