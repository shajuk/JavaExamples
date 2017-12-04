package generics.examples.boundbytype;

class A{
	public void display(){
		System.out.println("Inside the class A");
	}
}

class B extends A{
	public void display(){
		System.out.println("Inside the sub class B ");
	}
}

class C extends B{
	public void display(){
		System.out.println("Inside the sub class C.. ");
	}
}

class Bound<T extends A>{
	private T obj;
	public Bound(T obj) {
		this.obj=obj;
	}
	
	public void show(){
		obj.display();
	}
}

public class BoundByTypeExample {
	public static void main(String[] args) {
		Bound<A> bA=new Bound<A>(new A());
		bA.show();
		
		Bound<B> bB=new Bound<B>(new B());
		bB.show();
		
		Bound<C> bC=new Bound<C>(new C());
		bC.show();
	}
}
