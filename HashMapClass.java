package ssd;


import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"sameer");
		hm.put(56, null);
		hm.put(34,"dff");
		hm.put(null, null);
		hm.put(null,"SD");
		hm.put(2, null);
		hm.put(3, null);
		System.out.println(hm.toString());
		for(int i=0;i<5;i++) {
			hm.put(i, null);
		}
		hm.remove(0);
		for(Map.Entry<Integer, String> me:hm.entrySet()) {
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
	
		
		
	}

}
