package examples.inheritance.one;


public class CovariantParent implements InterfaceParent{

	@Override
	public SuperClass getInstance() {
		// TODO Auto-generated method stub
		return new SuperClass();
	}

}
