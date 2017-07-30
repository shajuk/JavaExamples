package examples.polymorphism;

public class Parent {
	
	public static int staticMethod(int x){
		return 0;
	}
	
	public static void staticMethod(){
		System.out.println("Parent method");
	}
	
	public Parent(InnerClass i) {
		// TODO Auto-generated constructor stub
		System.out.println(i.x);
	}
	
	public  class InnerClass{
		private int x;
		
	}
}
