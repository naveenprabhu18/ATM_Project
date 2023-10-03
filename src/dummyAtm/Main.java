package dummyAtm;

	// BankAccount class to store user's account balance
	class BankAccount {
	    private double balance;

	    public BankAccount(double initialBalance) {
	        balance = initialBalance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public boolean withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            return true;
	        } else {
	            return false;
	        }
	    }
	}

	// ATM class to interact with the user's bank account
	class ATM {
	    private BankAccount userAccount;

	    public ATM(double initialBalance) {
	        userAccount = new BankAccount(initialBalance);
	    }

	    public void deposit(double amount) {
	        userAccount.deposit(amount);
	    }

	    public boolean withdraw(double amount) {
	        return userAccount.withdraw(amount);
	    }

	    public double checkBalance() {
	        return userAccount.getBalance();
	    }
	}

	// Example usage
	public class Main {
	    public static void main(String[] args) {
	        ATM atm = new ATM(1000); // Starting balance of $1000

	        double depositedAmount = 500;
	        atm.deposit(depositedAmount);
	        System.out.println("Deposited $" + depositedAmount);

	        double withdrawnAmount = 300;
	        if (atm.withdraw(withdrawnAmount)) {
	            System.out.println("Withdrawn $" + withdrawnAmount);
	        } else {
	            System.out.println("Insufficient balance for withdrawal.");
	        }

	        double balance = atm.checkBalance();
	        System.out.println("Current balance: $" + balance);
	    }
	}

	 


