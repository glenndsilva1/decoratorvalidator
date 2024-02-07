package javavalidationprj.validate;

import java.util.ArrayList;

public class ValidateImpl implements ValidationService{
	public ArrayList<String> list = new ArrayList<String>();
	
	@Override
	public void valid(String value) {
		//  System.out.println("Hello");
		if(!value.equals("")){
			 list.add(value);
		}
	}
	
	int size() {
		return list.size();
	}
}
