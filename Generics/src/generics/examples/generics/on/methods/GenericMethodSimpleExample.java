package generics.examples.generics.on.methods;

import java.util.Arrays;

public class GenericMethodSimpleExample {
	
	public static void main(String[] args) {
		Integer[] intArray={1,2,3,4,5};
		String[] strArray={"Sreejith","Mani","Ajith","Remya"};
		
		printArray(strArray);
		printArray(intArray);
	}

	private static <T> void printArray(T[] array) {
		System.out.println("Displaying the contents of Array");
		Arrays.asList(array).forEach((item) -> System.out.println(item));
	}
}
