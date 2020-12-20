package EPAM;

public class Home {

	public static void main(String[] args) {
		
		BankAccount cust1=new SavingAccount(500);
		Cashier cas=new Cashier();
		cas.depTransfer(cust1, 300);
		cas.depTransfer(cust1, 500);
		
		cust1.balanceEnquiry();
		cas.withdraw(cust1, 400);
		cust1.balanceEnquiry();
	}
}