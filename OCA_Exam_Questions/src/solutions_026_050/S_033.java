package solutions_026_050;

class Employee {
	String name;
	boolean contract;
	double salary;
	Employee() {
		// line n1
//		this.name = new String("Joe");
//		this.contract = new Boolean(true);
//		this.salary = new Double(100);
	}
	public String toString() {
		return name + ":" + contract + ":" + salary;
	}
}

public class S_033 {

	public static void main(String[] args) {

		Employee e = new Employee();
		// line n2
//			e.name = "Joe";
//			e.contract = true;
//			e.salary = 100;
		System.out.println(e);
	}

}
