package ssd;

import java.util.Collection;
import java.util.HashSet;

public class HashSetProgram {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		HashSet< Integer> hs=new HashSet<>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);//duplicate not allowed
		
		System.out.println(hs);//insertion order is not preserved
	
	}

}
