package ssd;

import java.util.*;

public class IteratorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		al.sort(null);
		Iterator<Integer> itr=al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
