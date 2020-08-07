package sarmabaruaabhigyan_OOP_04;

//Creating the account class as an abstract class
public abstract class Account {
	
	//Considering two variables for the account number and the account balance
	int accountNumber;
	double balance;
	
	//generating the constructors for the account number and the account balance
	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	
	//Method for the deposit
	public void depositFunds(double deposit) {
		
		System.out.println("Deposit amount = "+deposit+" euro");
		//Considering the deposit to be invalid, if it is less than or equals to '0'
		if(deposit<=0) {
			System.out.println("Invalid deposit amount. Please try again.");
		}
		else {
			this.balance += deposit;
		}
	}
	
	//Method for the withdrawal
	public void withdrawFunds(double withdraw) {
		
		System.out.println("Withdrawal amount = "+withdraw+" euro");
		//Considering the withdrawal to be invalid, if it is less than or equals to '0', or more than the total account balance
		if(withdraw<=0 || withdraw>balance) {
			System.out.println("Invalid withdraw amount. Please try again.");
			System.out.println();
		}
		else {
			this.balance -= withdraw;
		}
	}
	
	//Defining an abstract method to be implemented by the sub classes
	public abstract void printAccountInfo();
	
}
