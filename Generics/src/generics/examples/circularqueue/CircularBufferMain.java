package generics.examples.circularqueue;


public class CircularBufferMain {

	public static void main(String[] args) {
		CircularBuffer<Integer> buffer=new CircularBuffer<>(2);
		System.out.println(buffer.push(1));
		System.out.println(buffer.push(2));
		System.out.println(buffer.push(3));
		System.out.println(buffer.pull());
		System.out.println(buffer.push(4));
		System.out.println(buffer.pull());

	}

}
