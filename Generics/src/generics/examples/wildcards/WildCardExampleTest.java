package generics.examples.wildcards;

import generics.examples.Employee;
import generics.examples.Person;
import generics.examples.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.ListView;

import org.junit.*;

import static org.junit.Assert.*;


public class WildCardExampleTest {
	
	private File file;
	private PersonSaver saver;
	private PersonLoader loader;
	
	@Before
	public void setUp() throws IOException{
		file=File.createTempFile("tmp", "people");
		saver=new PersonSaver(file);
		loader=new PersonLoader(file);
	}
	
	@After
	public void releaseResources(){
		if(file.exists()){
			file.delete();
		}
	}
	
	@Test
	public void cannotLoadFromEmptyFile() throws FileNotFoundException{
		PersonLoader ploader=new PersonLoader(file);
		assertNull(ploader.load());
	}
	
	@Test
	public void saveAndLoadPeople() throws IOException{
		Employee e1=new Employee("Rahul",32,"e101");
		saver.save(e1);
		assertEquals(loader.load(),e1);
		
	}
	@Test
	public void saveAndLoadTwoPeople() throws IOException{
		Employee e1=new Employee("Rahul",32,"e101");
		Student s1=new Student("SriHari", 12, "s101");
		saver.save(e1);
		saver.save(s1);
		assertEquals(loader.load(),e1);
		assertEquals(loader.load(),s1);
	}
	
	@Test
	public void saveListOfPeople() throws IOException{
		List<Person> persons=new ArrayList<>();
		Employee e1=new Employee("Rahul",32,"e101");
		Student s1=new Student("SriHari", 12, "s101");
		Person p=new Person("Babu",38,Person.class.getName());
		persons.add(e1);
		persons.add(s1);
		persons.add(p);
		saver.saveAll(persons);
		assertEquals(loader.load(),e1);
		assertEquals(loader.load(),s1);
		assertEquals(loader.load(),p);
	}
	
	@Test
	public void loadListOfPeople() throws IOException{
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
		assertEquals(persons, people);
	}
}
