
public class BankAccount {
	// https://github.com/WeCanCodeIT/wcci-columbus-2017-fall/blob/master/exercises/bank-teller.md
	
	//Instance Variables - String accountNum, String type, and double balance
	private String accountNum;
	private String type;
	private double balance;
	
	
	//Constructor
	public BankAccount(String accountNum, String type, double balance) {
    this.accountNum = accountNum;
    this.type = type;
    this.balance = balance;
	}
    
	// Accessor ("Getter") method
 	public String getAccountNum () {     /// standard naming convention is to use "get" in front. 
 		return accountNum;
 	}
 	public String getType () {
 		return type;
 	}
 	public double getBalance () {
 		return balance;
 	
 	}
    //Method of Behavior
    public void depositMoney(double deposit) {
    	balance += deposit;
    }
    
    public void withdrawMoney(double withdraw) {
    	balance += withdraw;
    }
    
    

}

