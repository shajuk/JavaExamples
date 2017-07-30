package examples.interfaces;

public class ParentChildMain {

	public static void main(String[] args) {
		InterfaceC p=new ParentInterfaceImpl();
		System.out.println(p.getResult());
		
		InterfaceC c=new ParentInterfaceImpl();
		System.out.println(c.getResult());
		
		InterfaceD child=new ChildInterfaceImpl();
		System.out.println(child.getResult());

	}

}
