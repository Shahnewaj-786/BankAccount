import java.lang.*;

public class SavingsAccount{
	
	
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	private double interestRate;
	private static double perTransactionLimit;
	
	
	
	public SavingsAccount(){
		System.out.println("Savings Account");
	}
	
	public static void setPerTransactionLimit(double ptl){
		perTransactionLimit = ptl;
	}
	
	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}
	
	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName = accountHolderName;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public void setInterestRate(double interestRate){
		this.interestRate = interestRate;
	}
	
	
	
	
	
	
	public double getInterestRate(){
		return interestRate;
	}
	
	public String getAccountNumber(){
		return accountNumber;
	}
	
	public String getAccountHolderName(){
		return accountHolderName;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public static double getPerTransactionLimit(){
		return perTransactionLimit;
	}
	
	
	
	
	
	
	
	
	public void depositMoney(double amount){
		if(amount>0){
			balance = balance+amount;
			System.out.println("Deposit Successfull \n Balance: "+balance);
		}else{
			System.out.println("Error");
		}
	}
	
	
	public void withdrawMoney(double amount){
		if (amount>0 && amount<=perTransactionLimit){
			balance = balance-amount;
			System.out.println("Withdraw Successfull \n Balance: "+balance);
		}else{
			System.out.println("Error");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}