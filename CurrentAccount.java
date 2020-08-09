package sarmabaruaabhigyan_OOP_04;

//Creating the current account class as a sub class of the account class
public class CurrentAccount extends Account {
	
	//taking the overdraft limit to be 200
	private double overdraftLimit = -200;
	private String typeOfAccount = "Current Account";
	private static int count = 0;					//To calculate the number of times the current account method runs

	//Constructor for the inheritance
	public CurrentAccount(int accountNumber) {
		super(accountNumber);
		System.out.println("Transaction against the account number: "+super.accountNumber);		//Displaying the account number
		count++;					//Increasing the count each time the method runs
	}
	
	//Method to calculate the withdrawal amount and the updated balance
	public void withdrawFunds(double withdraw) {
		
		System.out.println("Withdrawal amount = "+withdraw);
		//Considering the updated balance to be invalid, if it is less than overdraft limit
		if(super.balance - withdraw < overdraftLimit) {
			System.out.println("Invalid withdrawal amount. Exceeding overdraft limit.");
		}
		//Considering the withdrawal amount to be invalid, if it is less than or equals to '0'
		else if (withdraw <= 0) {
			System.out.println("Invalid withdrawal amount. Thw withdrawal amount can not be less than or equals to '0'");
		}
		else {
			super.balance = super.balance - withdraw;
		}
	}

	//Displaying all the account details along with the type of the account
	public void printAccountInfo() {
		System.out.println();				//To create gap between two sets of information
		System.out.println("ACCOUNT DETAILS: ");
		System.out.println("The account number is: "+super.accountNumber);
		System.out.println("The account type is: "+this.typeOfAccount);
		System.out.println("Overdraft Limit = "+this.overdraftLimit+" euro");
		System.out.println("The total balance is = "+this.balance+" euro");
		System.out.println();				//To create gap between two sets of information
	}
	
	//Displaying the total number of Current Account by displaying the number of count
	public void displayNumberOfAccounts() {
		System.out.println("The number of CURRENT ACCOUNT is = "+count);
		System.out.println();				//To create gap between two sets of information
	}
	
}
