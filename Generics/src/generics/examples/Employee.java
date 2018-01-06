package generics.examples;

public class Employee extends Person{
	private String empid; 
	
	public Employee(String name, Integer age, String empid) {
		super(name, age,Employee.class.getName());
		this.empid = empid;
	}
	public String getEmpid() {
		return empid;
	}
	
}
