package ssd;

import java.util.Vector;

public class VectorLegacyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v=new Vector<>();
		
		v.addElement(1);
		v.add(2);
		v.addElement(3);
		System.out.println(v);
		
		v.setElementAt(4, 1);
		
		System.out.println(v);
		
		System.out.println(v.firstElement());
		
		System.out.println(v.lastElement());
		
		System.out.println(v.elementAt(0));
		
		v.insertElementAt(5, 0);
		
		System.out.println(v);
		
		System.out.println(v.capacity());
	}

}
