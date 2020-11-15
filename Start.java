import java.lang.*;

public class Start{
	
	
	public static void main (String args[]){
		
		FixedAccount Account1 = new FixedAccount();
		
		Account1.setPerTransactionLimit(50000);
		Account1.setAccountNumber("A-01-5544");
		Account1.setAccountHolderName("Alex");
		Account1.setBalance(100000);
		Account1.setTenureYear(2020);
		
		
		System.out.println("Max Transaction Limit: "+Account1.getPerTransactionLimit() );
		System.out.println("Account Number: "+Account1.getAccountNumber() );
		System.out.println("Account Holder Name: "+Account1.getAccountHolderName() );
		System.out.println("Balance: "+Account1.getBalance() );
		System.out.println("Tenure Year: "+Account1.getTenureYear() );
		
		Account1.depositMoney(25000);
		Account1.withdrawMoney(17500);
		
		
		System.out.println("\n");
		
		
		
		SavingsAccount Account2 = new SavingsAccount();
		
		Account2.setPerTransactionLimit(5000);
		Account2.setAccountNumber("A-02-4455");
		Account2.setAccountHolderName("Devid");
		Account2.setBalance(25000);
		Account2.setInterestRate(5.45);
		
		
		System.out.println("Max Transaction Limit: "+Account2.getPerTransactionLimit() );
		System.out.println("Account Number: "+Account2.getAccountNumber() );
		System.out.println("Account Holder Name: "+Account2.getAccountHolderName() );
		System.out.println("Balance: "+Account2.getBalance() );
		System.out.println("Interest Rate: "+Account2.getInterestRate() );
		
		Account2.depositMoney(4500);
		Account2.withdrawMoney(1725);
		

	}
	
	
	
	
}