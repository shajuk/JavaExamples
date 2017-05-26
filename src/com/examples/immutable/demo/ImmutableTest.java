
package com.examples.immutable.demo;


import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class ImmutableTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date shajuDob=new Date(1985,9,30);
		Employee e1=Employee.newInstance("Shaju",shajuDob);
		System.out.println("Before Modification method call : "+e1);
		
		modifyObject(e1.getName(),e1.getDateOfBirth());
		shajuDob.setYear(1952);
		// Since the Employee object is Immutable modifyObject method has no effect
		// Also modifying Year part of Shaju's DOB has not effect 
		System.out.println("After Modification  method call : "+e1);
		
		Employee e2=Employee.newInstance("Shibu",new Date(1985,9,30));
		
		
		Map<Employee,String> employeeLocation=new HashMap<Employee,String>();
		employeeLocation.put(e1, "Kochi");
		employeeLocation.put(e2, "Doha");
		showEmployeeLocationDetails(employeeLocation);
		
		// Retrieving the data for Shibu
		retrieveEmployeeByNameAndDateOfBirth("Shibu",new Date(1985,9,30),employeeLocation);
	}

	@SuppressWarnings("deprecation")
	private static void modifyObject(String name, java.util.Date dateOfBirth) {
		name="blab";
		dateOfBirth.setDate(1970);
	}
	
	private static void showEmployeeLocationDetails(Map<Employee,String> employeeLocation){
		System.out.println("\nDisplaying all the employee records");
		for(Map.Entry<Employee,String> entry:employeeLocation.entrySet()){
			System.out.println(entry);
		}
	}
	
	private static void retrieveEmployeeByNameAndDateOfBirth(String name, Date dateOfBirth, Map<Employee,String> employeeLocation){
		Employee e=Employee.newInstance(name, dateOfBirth);
		System.out.println("\nDisplaying details of Employee "+e.getName());
		System.out.println("Employee "+e.getName()+" works from " +employeeLocation.get(e));
	}
}
