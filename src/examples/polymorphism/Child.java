package examples.polymorphism;

public class Child extends Parent{
	
	public Child(InnerClass i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	public static void staticMethod(){
		System.out.println("Child method");
	}
}
