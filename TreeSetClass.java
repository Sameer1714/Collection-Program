package ssd;



import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(1);
		ts.add(23);
		ts.add(3);
		ts.add(34);
		ts.add(56);
		ts.add(2);
		ts.add(67);
		
		
		
		System.out.println(ts);
		
		System.out.println(ts.descendingSet());
		
		System.out.println(ts.headSet(56));
		
		
		
	}

}
