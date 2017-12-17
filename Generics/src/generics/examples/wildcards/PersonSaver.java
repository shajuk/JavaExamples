package generics.examples.wildcards;

import generics.examples.Employee;
import generics.examples.Person;
import generics.examples.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

public class PersonSaver {
	private final RandomAccessFile file;

	public PersonSaver(File file) throws FileNotFoundException {
		super();
		this.file = new RandomAccessFile(file, "rw");
	}  
	
	public void save(Person person) throws IOException{
		if(null!=person){
			Employee e=null;
			Student s=null;
			if(person.getType().contains("Employee")){
				e=(Employee)person;
				file.writeUTF(e.getClass().getName());
				file.writeUTF(e.getName());
				file.writeUTF(e.getAge().toString());
				file.writeUTF(e.getEmpid());
			}else if(person.getType().contains("Student")){
				s=(Student)person;
				file.writeUTF(s.getClass().getName());
				file.writeUTF(s.getName());
				file.writeUTF(s.getAge().toString());
				file.writeUTF(s.getStudentId());
			}else{
				file.writeUTF(person.getType()); 
				file.writeUTF(person.getName());
				file.writeUTF(person.getAge().toString());
				
			}
			
		}
	}
	
	public void saveAll(final List<? extends Person> persons) throws IOException{
		for(Person p:persons){
			save(p);
		}
	}
}
