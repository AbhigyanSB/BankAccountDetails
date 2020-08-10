package sarmabaruaabhigyan_OOP_04;

//Creating the savings account class as a sub class of the account class
public class SavingsAccount extends Account {
	
	//considering the interest rate to be 4%, account type to be savings
	private double interestRate = 0.04;				//As 4% = 0.04
	private String typeOfAccount = "Savings Account";
	private static int count = 0;					//To calculate the number of times the savings account method runs

	//Constructor for the inheritance
	public SavingsAccount(int accountNumber) {
		super(accountNumber);
		System.out.println("Transaction against the account number: "+super.accountNumber);		//Displaying the account number
		count++;					//Increasing the count each time the method runs
	}
	
	//Method to calculate the balance, after calculating the interest rate and the updated balance
	public double savingsBalance() {
		super.balance += super.balance * this.interestRate;
		return balance;
	}
	
	//Displaying all the account details along with the type of the account
	public void printAccountInfo() {
		System.out.println();					//To create gap between two sets of information
		System.out.println("ACCOUNT DETAILS: ");
		System.out.println("The account number is: "+super.accountNumber);
		System.out.println("The account type is: "+this.typeOfAccount);
		System.out.println("Interest rate = "+this.interestRate+"%");
		System.out.println("The total balance is = "+savingsBalance()+" euro");
		System.out.println();					//To create gap between two sets of information
	}
	
	//Displaying the total number of Savings Account by displaying the number of count
	public void displayNumberOfAccounts() {
		System.out.println("The number of SAVINGS ACCOUNT is = "+count);
		System.out.println();					//To create gap between two sets of information
	}
	
}
