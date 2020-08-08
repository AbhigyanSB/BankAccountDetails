package sarmabaruaabhigyan_OOP_04;

//Creating the test class "Bank"
public class Bank {

	//Main method
	public static void main(String[] args) {
		
		//Creating an object S1 to test the Savings Account class and setting an account number
		SavingsAccount S1 = new SavingsAccount(1256383);
		
		//Testing with depositFunds method of the Account class with an invalid deposit amount
		S1.depositFunds(-10);
		
		//Testing with withdrawFunds method of the Account class with an invalid withdraw amount
		S1.withdrawFunds(200);

		//Displaying the updated account information
		S1.printAccountInfo();
		
		//Creating an object S2 to test the SavingsAccount class and setting an account number
		SavingsAccount S2 = new SavingsAccount(6754865);
		
		//Testing with depositFunds method of the Account class with a valid deposit amount
		S2.depositFunds(1200);
		
		//Displaying the updated account information
		S2.printAccountInfo();
		
		//Testing with withdrawFunds method of the Account class with a valid withdraw amount
		S2.withdrawFunds(1000);

		//Displaying the updated account information
		S2.printAccountInfo();
		
		//Testing with withdrawFunds method of the Account class with an invalid withdraw amount
		S2.withdrawFunds(500);
		
		//Displaying number of Savings Account
		S2.displayNumberOfAccounts();
		
		
		//Creating an object C1 to test the Current Account class and setting an account number
		CurrentAccount C1 = new CurrentAccount(9874352);
		
		//Testing with depositFunds method with a valid amount
		C1.depositFunds(2100);
		
		//Testing with withdrawFunds method with an invalid amount with negative value
		C1.withdrawFunds(-200);
		
		//Testing with withdrawFunds method with n valid amount
		C1.withdrawFunds(2200);
		
		//Displaying out the account information
		C1.printAccountInfo();
		
		//Creating an object C2 to test the Current Account class and setting an account number
		CurrentAccount C2 = new CurrentAccount(8762342);
		
		//Testing with depositFunds method with a valid amount
		C2.depositFunds(2500);
		
		//Testing with withdrawFunds method with an invalid amount with higher value than the overdraft limit
		C2.withdrawFunds(3000);
		
		//Testing with withdrawFunds method with n valid amount
		C2.withdrawFunds(300);
		
		//Displaying out the account information
		C2.printAccountInfo();
		
		//Displaying number of Current Account
		C2.displayNumberOfAccounts();
		
	}

}
