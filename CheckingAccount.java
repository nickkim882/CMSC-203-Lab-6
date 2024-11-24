
public class CheckingAccount extends BankAccount {
	
	private static final double FEE = 0.15;
	
	public CheckingAccount(String name, double amount){
		
		super(name, amount);
		
		super.setAccountNumber(getAccountNumber() + "-10");
		
	}
	
	public boolean withdraw(double amount) {
		
		double total = amount + FEE;
		
		return super.withdraw(total);
		
	}

}
