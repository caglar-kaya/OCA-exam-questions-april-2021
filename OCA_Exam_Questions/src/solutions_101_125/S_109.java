package solutions_101_125;

class Customer {
	
	ElectricAccount acct = new ElectricAccount();
	
	public void useElectricity(double kWh) {
		acct.addKWh(kWh);
	}
}

class ElectricAccount {
	private double kWh;
	private double rate = 0.07;
	private double bill;
	
	public void addKWh(double kWh) {
		if (kWh > 0) {
			this.kWh += kWh;
			this.bill = this.kWh * this.rate;
		}
	}

	public double getBill() {
		return bill;
	}
	
}

public class S_109 {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.useElectricity(1000);
		System.out.println(customer.acct.getBill());
	}

}
