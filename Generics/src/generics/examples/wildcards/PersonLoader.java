package generics.examples.wildcards;

import generics.examples.Employee;
import generics.examples.Person;
import generics.examples.Student;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class PersonLoader {
	private final RandomAccessFile file;

	public PersonLoader(File file) throws FileNotFoundException {
		this.file = new RandomAccessFile(file, "rw");
	}

	public Person load() {
		try {
			
			String className = file.readUTF();
			if (null == className) {
				return null;
			}
			if (className.contains("Employee")) {
				String name = file.readUTF();
				Integer age = Integer.valueOf(file.readUTF());
				String empid = file.readUTF();
				Class<?> employeeClass = Class.forName(className);
				Constructor<?> employeeConstructor = employeeClass.getConstructor(String.class, Integer.class,String.class);
				Employee e = (Employee) employeeConstructor.newInstance(name,age, empid);
				return e;
			}else if(className.contains("Student")){
				String name = file.readUTF();
				Integer age = Integer.valueOf(file.readUTF());
				String studentId = file.readUTF();
				Class<?> studentClass=Class.forName(className);
				Constructor<?> studentConstructor=studentClass.getConstructor(String.class, Integer.class,String.class);
				Student s=(Student)studentConstructor.newInstance(name,age, studentId);
				return s;
			}else if(className.contains("Person")){
				String name = file.readUTF();
				Integer age = Integer.valueOf(file.readUTF());
				Class<?> personClass=Class.forName(className);
				Constructor<?> personConstructor=personClass.getConstructor(String.class, Integer.class,String.class);
				Person p=(Person)personConstructor.newInstance(name, age,className);
				return p;
			}

		} catch (IOException | ClassNotFoundException  | NoSuchMethodException
				| SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void loadAll(List<? super Person> persons){
		Person p;
		while((p=load())!=null){
			persons.add(p);
		}
	}
}
