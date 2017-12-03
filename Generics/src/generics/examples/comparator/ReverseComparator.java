package generics.examples.comparator;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T>{

	private Comparator<T> comparator;

	public ReverseComparator(Comparator<T> comparator) {
		this.comparator=comparator;
	}
	
	@Override
	public int compare(T o1, T o2) {
		return -1 * comparator.compare(o1, o2);
	}
	

}
