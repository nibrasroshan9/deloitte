package demo;

public class Customer {

	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount = 1000;
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	
	public Customer() {
		this.customerId = 1001;
		customerName = "NA";
		customerAddress = "NA";
		billAmount = 500;
		System.out.println("Default cons called");
	}

	public Customer (int customerId, String name, String add, int bill) {
		this.customerId = customerId;
		this.customerName = name;
		this.customerAddress = add;
		this.billAmount = bill;
		System.out.println("Parameterised cons called");
	}
	
	public void printDetails() {
		System.out.println("ID : "+this.customerId);
		System.out.println("Name : "+this.customerName);
		System.out.println("Address : "+this.customerAddress);
		System.out.println("Amount : "+this.billAmount);
		

	}
}
