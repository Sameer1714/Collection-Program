package ssd;

import java.util.TreeSet;

public class TreeSetProgram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		TreeSet<Integer> ts=new TreeSet<>();
		
		ts.add(10);
		ts.add(20);
		ts.add(4);
		//ts.add(null); Null Element Not Allowed
		System.out.println(ts);//Output in ascending Order
	}

}
