package jspiders;

public class BankImpl implements Bank {
private int balance;

public BankImpl(int balance) {

	this.balance = balance;
}

@Override
public void deposit(int amount) {
	System.out.println("Depositing Rs."+amount);
	balance=balance+amount;
	System.out.println("Deposited Successfully");
	
}

@Override
public void withdraw(int amount) {
	if(amount<=balance) {
		System.out.println("Withdrawing Rs. "+amount);
		balance = balance-amount;
		System.out.println("Withdrawn Successfully");
	}
	else {// Invoke an Exception and handle it using try and catch block
try {
	throw new InsufficientBalanceException("Insufficient Balance ");
	}
catch(Exception e){
	System.out.println(e.getMessage());
}
}
}

@Override
public int getBalance() {
	return balance;
}

@Override
public String displayErrorMessage() {
	return "Invalid Choice!!,Kindly Enter valid choice";
}


}
