package examples.interfaces;

public class InterfaceImplementation implements InterfaceA,InterfaceB{

	private int a,b=0;
	private float x,y=0.0f;
	
	public void performOperation() {
		
	}
	
	
	public void getInputs(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public float getInputs(float a, float b) {
		this.x=a;
		this.y=b;
		return 0.0f;
	}




	@Override
	public float getResult(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public int getResult(int x) {
		// TODO Auto-generated method stub
		return 0;
	}


	


}

//- Duplicate method getResult() in type 
//InterfaceImplementation
//- The return type is incompatible with 
//InterfaceA.getResult()