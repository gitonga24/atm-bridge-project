package atmbridgeproject;

public class Atm {
	
	String requiredPin;
	double acctBalance = 50.00;
	
	
	boolean allowAccess(String enteredPin) {
		return (enteredPin == requiredPin);
	}
	
	
	public void depositAmount(double deposit) {
		acctBalance += deposit;
	}

	
	public double getBalance() {	
		return acctBalance;
	}

}
