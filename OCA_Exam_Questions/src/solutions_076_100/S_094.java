package solutions_076_100;

class Person {
	String name;
	int age = 25;
	
	Person(String name) { // line n1
		setName(name);
	}

	public Person(String name, int age) {
		// Person(name); 					// line n2
		// The method Person(String) is undefined for the type Person
		setAge(age);
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
	
}

public class S_094 {

	public static void main(String[] args) {

		
	}

}
