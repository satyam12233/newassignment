package maintenancecharge.demo;

//account credentials
class Account {

	private String account_Number;
	private String customerName;
	private double balance;

	public Account(String account_Number, String customerName, double balance) {
		this.account_Number = account_Number;
		this.customerName = customerName;
		this.balance = balance;
	}

	public String getAccount_Number() {
		return account_Number;
	}

	public void setAccount_Number(String account_Number) {
		this.account_Number = account_Number;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}