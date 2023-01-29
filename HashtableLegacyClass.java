package ssd;

import java.util.Hashtable;
import java.util.Map;

public class HashtableLegacyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String>hs=new Hashtable<>();
		hs.put(12, "Samee");
		hs.put(234, "asdf");
		System.out.println(hs);
		
		
		for(Map.Entry<Integer, String>m:hs.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
