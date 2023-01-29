package ssd;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(101, "vijay");
		tm.put(100, "SD");
		
		System.out.println(tm);
		
		System.out.println(tm.pollFirstEntry());//it also delete it
		
		for(Map.Entry<Integer, String>m:tm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
