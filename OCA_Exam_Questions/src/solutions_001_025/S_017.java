package solutions_001_025;

class Test {
	int x, y;
	
	public Test(int x, int y) {
		initialize(x, y);
	}
	
	public void initialize(int x, int y) {
		this.x = x * x;
		this.y = y * y;
	}
}

public class S_017 {

	public static void main(String[] args) {
		int x = 3, y = 5;
		Test obj = new Test(x, y);
		System.out.println(x + " " + y); // 3 5 
		System.out.println(obj.x);		 // 9
		System.out.println(obj.y);		 // 25
	}

}
