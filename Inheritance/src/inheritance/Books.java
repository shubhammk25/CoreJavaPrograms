package inheritance;

public class Books {
	
	private int no_of_pages=1000;
	private int no_of_quantity;
	
	public int getNo_of_pages() {
		return no_of_pages;
	}
	
	public int getNo_of_quantity() {
		return no_of_quantity;
	}
	public void setNo_of_quantity(int no_of_quantity) {
		this.no_of_quantity = no_of_quantity;
	}
	
	public Books(int no_of_quantity) {
		super();
		this.no_of_pages = no_of_pages;
		this.no_of_quantity = no_of_quantity;
	}

	
	

}
