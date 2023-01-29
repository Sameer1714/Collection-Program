package ssd;

import java.util.Collection;
import java.util.LinkedHashSet;

public class LinkedHassetProgram {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		LinkedHashSet<Integer> ls=new LinkedHashSet<>();
		
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(10);//duplicate is not allowed
		
		System.out.println(ls);//insertion order is preserved
		
	
	}

}
