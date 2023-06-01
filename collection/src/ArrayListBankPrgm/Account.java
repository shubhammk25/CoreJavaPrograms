package ArrayListBankPrgm;

public class Account {

	private String User_name;
	private long account_number;
	private long contact_number;
	private int balace;
	private String city;
	private int password;
	
	public String getUser_name() {
		return User_name;
	}
	public long getAccount_number() {
		return account_number;
	}
	public long getContact_number() {
		return contact_number;
	}
	public int getBalace() {
		return balace;
	}
	public String getCity() {
		return city;
	}
	public int getPassword() {
		return password;
	}
	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public void setBalace(int balace) {
		this.balace = balace;
	}
	
	public Account(String user_name, long account_number, long contact_number, int balace, String city, int password) {
		super();
		User_name = user_name;
		this.account_number = account_number;
		this.contact_number = contact_number;
		this.balace = balace;
		this.city = city;
		this.password = password;
	}
	
	public String toString()
	{
		return "User_Name: "+User_name+"\nAccount_Number: "+account_number+"\nContact_Number: "+contact_number+"\nBalance: "+balace+"\nCity: "+city;
	}
	
	
	
	
	
	
}
