
public class SavingsAccount extends BankAccount{
	
	private final double rate = .025;
	private int savingsNumber;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		
		super(name, amount);
		savingsNumber = 0;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		
	}
	
	public SavingsAccount(SavingsAccount original, double amount) {
		
		super(original, amount);
		this.savingsNumber = original.savingsNumber ++;
		accountNumber = getAccountNumber() + "-" + this.savingsNumber;
		
	}
	
	public void postInterest() {
		
		double interest = getBalance() * (rate/12);
		
		deposit(interest);
		
	}
	
	public String getAccountNumber() {
		
		return accountNumber;
		
	}

}
