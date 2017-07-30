package examples.inheritance.covariant.method.overriding;

public class Main {
	public static void main(String[] args) {
		EmployeeDetails p=new EmployeeDetails();
		p.setEmployee(new Employee("Shaju", 100));
		System.out.println(p.getDetails().getName());
		System.out.println(p.getDetails().getEmpId());
	}
}
