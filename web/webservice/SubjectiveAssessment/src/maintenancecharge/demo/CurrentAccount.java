package maintenancecharge.demo;

public class CurrentAccount extends Account implements MaintenanceCharge {

	public CurrentAccount(String account_Number, String customerName, double balance) {
		super(account_Number, customerName, balance);
	}

	@Override
	public double calculateMaintenanceCharge(double noOfYears) {
		double maintenanceCharge = 100 * noOfYears + 200; 
		return maintenanceCharge;
	}

}
