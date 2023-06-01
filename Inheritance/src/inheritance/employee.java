package inheritance;

public class employee {
	
	private String name;
	private int cno;
	private String cname;
	private int id;
	public String getName() {
		return name;
	}
	public int getCno() {
		return cno;
	}
	public String getCname() {
		return cname;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public employee(String name, int cno, String cname, int id) {
		super();
		this.name = name;
		this.cno = cno;
		this.cname = cname;
		this.id = id;
	}
	
	

}
