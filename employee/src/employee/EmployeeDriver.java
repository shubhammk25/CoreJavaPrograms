package employee;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1=new Employee("abc",2002,500000);
		System.out.println(e1.getName());
		System.out.println(e1.getId());
		System.out.println(e1.getSalary());
		System.out.println("..............");
		e1.setName("xyz");
		e1.setId(2003);
		e1.setSalary(1000000);
		System.out.println(e1.getName());
		System.out.println(e1.getId());
		System.out.println(e1.getSalary());
		
	}

}
