package generics.examples.circularqueue;

public class CircularBuffer<T> {
	
	private T[] buffer;
	private int readCursor=0;
	private int writeCursor=0;
	
	@SuppressWarnings("unchecked")
	public CircularBuffer(int size) {
		buffer=(T[])new Object[size];
	}
	
	public boolean push(T value){
		if(buffer[writeCursor] !=null){
			return false;
		}
		buffer[writeCursor]=value;
		writeCursor=next(writeCursor);
		return true;
	}
	
	public T pull(){
		T value=buffer[readCursor];
		if(null!=value){
			buffer[readCursor]=null;
			readCursor=next(readCursor);
		}
		return value;
	}

	private int next(int index) {
		return (index+1) % buffer.length;
	}
}
