package solutions_076_100;

class MarkList {
	int num;
	public static void graceMarks(MarkList obj4) {
		obj4.num += 10;
	}
}

public class S_087 {

	public static void main(String[] args) {
		MarkList obj1 = new MarkList();
		MarkList obj2 = obj1;
		MarkList obj3 = null;
		obj2.num = 60;
		System.out.println(obj1.num); // 60
		System.out.println(obj2.num); // 60
		MarkList.graceMarks(obj2);
		System.out.println(obj1.num); // 70
		System.out.println(obj2.num); // 70
		
		// Only 1 MarkList instance is created.
	}

}
