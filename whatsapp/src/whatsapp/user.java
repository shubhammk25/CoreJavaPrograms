package whatsapp;
public class user {
	private String userName;
	private long contactNumber;
	private String status;
	private int pswd;
	
	
	
	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public long getContactNumber() {
		return contactNumber;
	}



	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public int getPswd() {
		return pswd;
	}



	public void setPswd(int pswd) {
		this.pswd = pswd;
	}



	public user(String userName, String status, long contactNumber, int pswd) {
	
		this.userName = userName;
		this.status = status;
		this.contactNumber = contactNumber;
		this.pswd = pswd;
	}	
}
