package ssd;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "Sammer");
		m.put(2, "Aniket");
		m.put(3, "subhod");
		m.put(4, "prashya");
		
		System.out.println(m);
		
		for(Map.Entry<Integer,String> s:m.entrySet()) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
		System.out.println("---------------------------");
		
		
	}

}
