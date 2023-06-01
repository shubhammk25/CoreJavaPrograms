package HashsetEmp;

public class Employee {

	private String name;
	private int id;
	private String dept;
	private double pswd;
	private double sal;
	
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setPswd(double pswd) {
		this.pswd = pswd;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getDept() {
		return dept;
	}
	public double getPswd() {
		return pswd;
	}
	public double getSal() {
		return sal;
	}
	
	public Employee(String name, int id, String dept, double pswd, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.pswd = pswd;
		this.sal = sal;
	}
	
	
	
	
	
	
	
}
