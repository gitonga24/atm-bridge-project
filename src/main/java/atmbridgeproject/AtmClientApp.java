package atmbridgeproject;

import java.util.Scanner;

public class AtmClientApp {

	public static void main(String[] args) {


		Atm newCustomer = new Atm();
		

		Scanner input = new Scanner(System.in);
		
			
		System.out.println("Enter 1 to Deposit funds:");
		
		int userInput = input.nextInt();
		input.nextLine();
		
		switch (userInput){
			
		
			case 1: System.out.println("Enter $ to deposit");
					double userDepositAmount = input.nextInt();
					newCustomer.depositAmount(userDepositAmount);
					System.out.println("New balance: " + newCustomer.getBalance());
					break;
					
					
		
		}
		
		
	}

}
