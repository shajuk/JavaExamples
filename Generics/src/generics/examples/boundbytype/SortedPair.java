package generics.examples.boundbytype;
/**
 * @author Shaju
 * The SortedPair ensures that any parameter passed to it should be comparable to itself
 *This class also make sure that every object have pair of values and those values are sorted ascending
 * For example if you pass the value 2, 1 still it will be stored as 1, 2
 * 
 */
public class SortedPair<T extends Comparable<T>> {
	private T first;
	private T second;
	
	public SortedPair(T first, T second) {
		if(first.compareTo(second) < 0){
			this.first = first;
			this.second = second;
		}else{
			this.first = second;
			this.second = first;
		}
		
	}

	public T getFirst() {
		return first;
	}

	public T getSecond() {
		return second;
	}
	
	
}
