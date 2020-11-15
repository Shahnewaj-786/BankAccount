import java.lang.*;

public class FixedAccount{
	
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	private int tenureYear;
	private static double perTransactionLimit;
	
	
	public FixedAccount(){
		System.out.println("Account");
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
	
	public void setTenureYear (int tenureYear){
		this.tenureYear = tenureYear;
	}
	
	
	
	
	
	public static double getPerTransactionLimit(){
		return perTransactionLimit;
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
	
	public int getTenureYear(){
		return tenureYear;
	}
	
	
	
	
	
	
	public void depositMoney(double amount){
		if(amount>0){
			balance=balance+amount;
			System.out.println("Transaction Complete \n Current Balance: "+balance);
		}else{
			System.out.println("Error");
		}
	}
	
	
	public void withdrawMoney(double amount){
		if (amount>0 && amount<= perTransactionLimit){
			balance = balance-amount;
			System.out.println("Withdraw Successfull \n Current Balance: "+balance);
		}else{
			System.out.println("Error");
		}
	}
	
	
	
	
	
	
}