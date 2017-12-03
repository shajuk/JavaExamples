package generics.examples.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> persons=new ArrayList<>();
		persons.add(new Person("Raju", 28));
		persons.add(new Person("Anoop", 24));
		persons.add(new Person("Manish", 30));
		System.out.println(persons);
		System.out.println("Sorting by Age");
		Collections.sort(persons,new AgeComparator());
		System.out.println(persons);
		Collections.sort(persons, new ReverseComparator<>(new AgeComparator()));
		System.out.println(persons);
		System.out.println("Sorting by Name");
		Collections.sort(persons, new NameComparator());
		System.out.println(persons);
		Collections.sort(persons, new ReverseComparator<>(new NameComparator()));
		System.out.println(persons);
		
	}

}
