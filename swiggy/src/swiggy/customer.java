package swiggy;

public class customer {
	private String userName;
	private  long contactNumber;
	private String area;
	private String order;
	private int orderNumber;
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
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public customer(String userName, long contactNumber, String area, String order, int orderNumber) {
		
		this.userName = userName;
		this.contactNumber = contactNumber;
		this.area = area;
		this.order = order;
		this.orderNumber = orderNumber;
	}
	
	
	

}
