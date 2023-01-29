package ssd;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> ls=new LinkedHashMap<>();
		ls.put("india", "Delhi");
		ls.put("us", "washiton");
		ls.put("china", "shinjinping");
		ls.put("pakistan","lahore");
		
		for(Map.Entry<String, String> m:ls.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		
		System.out.println(ls.values());//only values
		System.out.println(ls.keySet());//only keys
		System.out.println(ls.entrySet());//both keys & values
		
		
	}

}
