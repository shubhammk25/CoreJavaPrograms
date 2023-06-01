package bank;

public class account {
	private String userName;
	private String city;
	private String ifsc;
	private long contactNumber;
	private long accountNumber;
	int pin;
	int balance;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public account(String userName, String city, String ifsc, long contactNumber, long accountNumber, int pin,
			int balance) {
		this.userName = userName;
		this.city = city;
		this.ifsc = ifsc;
		this.contactNumber = contactNumber;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = balance;
	}
	
	
	

}
