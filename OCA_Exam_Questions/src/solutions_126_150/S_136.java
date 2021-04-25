package solutions_126_150;

import java.util.ArrayList;
import java.util.List;

public class S_136 {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Tech");
		arrayList.add("Expert");
		arrayList.set(0, "Java");
		
		System.out.println(arrayList); // [Java, Expert]

		arrayList.forEach(a -> a.concat("Forum"));
		System.out.println(arrayList); // [Java, Expert]

		arrayList.replaceAll(s -> s.concat("Group"));
		System.out.println(arrayList); // [JavaGroup, ExpertGroup]
	}

}
