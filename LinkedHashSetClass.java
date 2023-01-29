package ssd;


import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Integer> lsh=new LinkedHashSet<>();
		
		lsh.add(null);//Only one Null Possible
		lsh.add(1);
		lsh.add(1);//Duplicate Not Allowed
		System.out.println(lsh);
		
		LinkedHashSet<String> ls=new LinkedHashSet<>();
		ls.add("Sammer");
		ls.add("sd");
		ls.add("Aniket");//A & a are act as different
		ls.add("aniket");
		System.out.println(ls);
		
		Iterator<String> itr=ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
