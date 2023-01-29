package ssd;

import java.util.*;


public class ConvertArraytoList {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int[] arr= {10,20,30,45,60,9};
		
		ArrayList<Integer> al=new ArrayList<>();
		for(int i:arr) {
			al.add(i);
		}
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println(al.subList(3, 4));
		
		
		
		
	}

}
