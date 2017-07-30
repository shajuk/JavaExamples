package examples.inheritance.covariant.method.overriding;

public class Employee extends Person{
	
	private int empId;
	
	public Employee(String name,int empId) {
		super(name);
		this.empId=empId;
	}
	
	public int getEmpId() {
		return empId;
	}
}
