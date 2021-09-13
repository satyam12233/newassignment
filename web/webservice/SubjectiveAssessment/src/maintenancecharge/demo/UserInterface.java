package maintenancecharge.demo;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Saving Account");
		System.out.println("2. Current Account");
		System.out.println("Enter your choice : Enter 1 for Saving account and 2 for current account");
		int accountType = sc.nextInt();
		
		System.out.println("Enter the Account Number");
		String accountNo = sc.next();
		
		System.out.println("Enter the customer name ");
		String customerName = sc.next();
		
		System.out.println("Enter the Balance amount ");
		double amount = sc.nextDouble();
		
		System.out.println("Enter the number of years ");
		int noOfYears = sc.nextInt();
		
		double maintenanceCharge = 0.0;
		
		System.out.println("Customer Name " + customerName);
		System.out.println("Account Number " + accountNo);
		System.out.println("Account Balance " + amount);
		
		
		
		if(accountType == 1) {	//  for saving account
			// creating object for saving account
			SavingAccount savingAccount = new SavingAccount(accountNo, customerName, amount);
			maintenanceCharge = savingAccount.calculateMaintenanceCharge(noOfYears);
			System.out.println("MaintenanceCharge for saving account is Rs " + maintenanceCharge);
			
	     
		} else if (accountType == 2){//  for current account
			
			// creating object for saving account
			CurrentAccount currentAccount = new CurrentAccount(accountNo, customerName, amount);
			maintenanceCharge = currentAccount.calculateMaintenanceCharge(noOfYears);
			System.out.println("MaintenanceCharge for current account is Rs " + maintenanceCharge);
		} else {
			System.out.println("Choosen Invalid account type : " + accountType);
		}
		
		main(args);
}
}
