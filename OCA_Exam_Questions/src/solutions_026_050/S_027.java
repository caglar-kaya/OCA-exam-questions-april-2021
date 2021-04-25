package solutions_026_050;

class CheckingAccount {
	public int amount;
	// line n1
	
//	public CheckingAccount() {	// OK
//		amount = 100;
//	}
	
//	public CheckingAccount() {	// OK
//		this.amount = 100;
//	}
	
}

public class S_027 {

	public static void main(String[] args) {
		
		CheckingAccount acct = new CheckingAccount();
		// line n2
		acct.amount = 100;
		System.out.println(acct.amount);
	}

}
