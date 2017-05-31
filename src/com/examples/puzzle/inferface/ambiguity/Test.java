package com.examples.puzzle.inferface.ambiguity;

import java.util.ArrayList;
import java.util.List;

public class Test implements AB{

	
	public static void main(String[] args) {
	Test t=new Test();
	
	}
    public void test(AB object){
    	Number n= ((A)object).getList().get(1);
    }
	@Override
	public List getList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
