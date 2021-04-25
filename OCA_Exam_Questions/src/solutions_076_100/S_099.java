package solutions_076_100;

class Employee {
	private String name;
	private int age;
	private int salary;
	
	public Employee(String name, int age) {
		setName(name);
		setAge(age);
		setSalary(2000);
	}
	
	public Employee(String name, int age, int salary) {
		setSalary(salary);
		// this(name, age); 
		// Constructor call must be the first statement in a constructor
	}
	
	public void printDetails() {
		System.out.println("Details..");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}

public class S_099 {

	public static void main(String[] args) {
		
		// Employee e1 = new Employee();
		// The constructor Employee() is undefined
		
		Employee e2 = new Employee("Jack", 50);
		Employee e3 = new Employee("Chloe", 40, 5_000);
		
		// e1.printDetails();
		e2.printDetails();
		e3.printDetails();
		
	}

}
