package generics.examples.typesaftey;

import java.util.Arrays;

import generics.examples.Employee;
import generics.examples.Person;
import generics.examples.Student;

public class TypeSafetyProblemWithArray {

	public static void main(String[] args) {
		// No issues here
		Person[] persons1=new Person[2];
		persons1[0]=new Employee("Vijay", 38, "e101");
		persons1[1]=new Student("Sreeram", 22, "s100");
		Arrays.asList(persons1).forEach(p -> System.out.println(p));
		
		// Type safety problem here
		System.out.println("\nType safety issue");
		Person[] persons=new Employee[2];
		persons[0]=new Employee("Vijay", 38, "e101");
		Arrays.asList(persons).forEach(p -> System.out.println(p));
		persons[1]=new Student("Sreeram", 22, "s100");
	}

}
