package examples.inheritance.covariant.method.overriding;

public class EmployeeDetails extends PersonDetails{
	private Employee employee;

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
//	This will result in error as this is not a valid overriding as the return type is incompatible with Parent
//	public String getDetails() {
//		return ""+this.employee.getName()+" "+this.employee.getEmpId();
//	}
	
	//This is an example of Covariant  method overriding
	public Employee getDetails() {
		return this.employee;
	}
}
