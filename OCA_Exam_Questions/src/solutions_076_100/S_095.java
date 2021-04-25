package solutions_076_100;

import java.util.ArrayList;
import java.util.List;

class Product2 {
	int id;
	String name;
	public Product2(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class S_095 {

	public static void main(String[] args) {
		List<Product2> list = new ArrayList<Product2>();
		list.add(new Product2(10, "IceCream"));
		list.add(new Product2(11, "Chocolate"));
		Product2 p1 = new Product2(10, "IceCream");
		System.out.println(list.indexOf(p1));
	}

}
