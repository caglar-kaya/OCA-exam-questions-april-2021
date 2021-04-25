package solutions_101_125;

class Cart {
	Product p;
	double totalAmount;
}

class Product {
	String name;
	Double price;
}

public class S_120 {
	public static void main(String[] args) {
		Cart c = new Cart();
		System.out.println(c.p + ":" + c.totalAmount);
	}

}
