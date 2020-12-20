package EPAM;

class SavingAccount implements BankAccount {
	double accbalance;

	SavingAccount(double inibalance) {
		accbalance = inibalance;
	}

	@Override
	public void deposit(double amt) {
		accbalance = accbalance + amt;
		System.out.println("Deposit " + amt + " Rs.");
	}

	@Override
	public void withdraw(double amt) {
		accbalance = accbalance - amt;
		System.out.println("withdraw " + amt + " Rs.");
	}

	@Override
	public void balanceEnquiry() {

		System.out.println("Balance Amt is  " + accbalance + " Rs.");
	}
}


class LoanAccount implements BankAccount {
	double accbalance;

	LoanAccount(double inibalance) {
		accbalance = inibalance;
	}

	@Override
	public void deposit(double amt) {
		accbalance = accbalance + amt;
		System.out.println("Deposit " + amt + " Rs.");
	}

	@Override
	public void withdraw(double amt) {
		accbalance = accbalance - amt;
		System.out.println("withdraw " + amt + " Rs.");
	}

	@Override
	public void balanceEnquiry() {

		System.out.println("Balance Amt is  " + accbalance + " Rs.");
	}

}

class Cashier {

	void depTransfer(BankAccount acc, double val) {
		acc.deposit(val);
	}

	
	void withdraw(BankAccount acc, double val) {
		acc.withdraw(val);
		}
	
}
