package ssd;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetClass {

	public static void main(String[] args) {
		

		HashSet<Integer> hs=new HashSet<>();
		
		
		hs.add(null);
		hs.add(12);
		hs.add(23);
		hs.add(1);
		hs.add(45);
		hs.add(77);
		System.out.println(hs);
		
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("sameer");
		hs1.add("Subho");
		hs1.add("Anu");
		hs1.add("SDd");
		
		System.out.println(hs1);
		hs1.remove("SDd");

		
		Iterator<String> itr=hs1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		if(hs1.contains("sameer")) {
			System.out.println("founddddddd");
		}
		
	}

}
