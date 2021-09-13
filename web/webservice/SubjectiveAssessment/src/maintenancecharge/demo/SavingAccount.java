package maintenancecharge.demo;

public class SavingAccount extends Account implements MaintenanceCharge {

	public SavingAccount(String account_Number, String customerName, double balance) {
		super(account_Number, customerName, balance);
	}

	@Override
	public double calculateMaintenanceCharge(double noOfYears) {
		double maintenanceCharge = 50 * noOfYears + 50; 
		return maintenanceCharge;
	}

}
