package solutions_101_125;

class StockRoom {
	private static int stock = 10;
	int qty = 5;
	public void puchase(int qty) { stock += qty;}
	public void sell(int qty) { stock -= qty;}
	public void printStock(String action) {
		System.out.println(action + ":" + qty + " items. Stock in Hand: " + stock);
	}
}

public class S_113 {

	public static void main(String[] args) {
		StockRoom k1 = new StockRoom();
		k1.sell(5);
		k1.printStock("Sold");
			StockRoom k2 = new StockRoom();
			k2.puchase(5);
			k2.printStock("Purchased");
		
	}

}
