package examples.inheritance.one;

public class CovariantParentChildMain {
	public static void main(String[] args) {
		CovariantParent c=new CovariantChild();
		System.out.println(c.getInstance().getResult());
		
		CovariantParent p=new CovariantParent();
		System.out.println(p.getInstance().getResult());
	}
}
