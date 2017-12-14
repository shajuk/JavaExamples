package generics.examples.generics.on.methods;
import generics.examples.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Person> persons=new ArrayList<>();
		persons.add(new Person("Raju", 28,null));
		persons.add(new Person("Anoop", 24,null));
		persons.add(new Person("Manish", 30,null));
		System.out.println(persons);
		Person p=min(persons,new AgeComparator());
		System.out.println("Details of youngest person\n"+p);
		
		//Reusing the same min method for finding min of numbers
		List<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("Minimum of numbers among "+numbers+" is:");
		System.out.println(min(numbers,Integer::compare));
	}

	private static <T> T min(List<T> list, Comparator<T> comparator) {
		if(list.isEmpty()){
			throw new IllegalArgumentException("Person list cannot be empty");
		}
		T lowest=list.get(0);
		
		for(int i=1;i<list.size();i++){
			if(comparator.compare(list.get(i), lowest) < 0){
				lowest=list.get(i);
			}
		}
		
		return lowest;
	}
}
