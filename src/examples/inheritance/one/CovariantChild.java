package examples.inheritance.one;

public class CovariantChild extends CovariantParent implements InterfaceChild{

	@Override
	public SubClass getInstance() {
		// TODO Auto-generated method stub
		return new SubClass();
	}

}
