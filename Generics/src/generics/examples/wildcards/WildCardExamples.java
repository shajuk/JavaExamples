package generics.examples.wildcards;

import generics.examples.Employee;
import generics.examples.Person;
import generics.examples.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WildCardExamples {
	
	
	public static void main(String[] args) throws IOException {
		File file=File.createTempFile("tmp", "people");
		PersonSaverLoader saver=new PersonSaverLoader(file);
		PersonSaverLoader loader=new PersonSaverLoader(file);
		
		List<Person> persons=new ArrayList<>();
		Employee e1=new Employee("Rahul",32,"e101");
		Student s1=new Student("SriHari", 12, "s101");
		Person p=new Person("Babu",38,Person.class.getName());
		persons.add(e1);
		persons.add(s1);
		persons.add(p);
		
		saver.saveAll(persons);
		List<Object> people=new ArrayList<>();
		loader.loadAll(people);
		System.out.println(people);
	}
	
	
}
