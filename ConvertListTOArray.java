package ssd;

import java.util.*;
public class ConvertListTOArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
	Integer arr[]=al.toArray(new Integer[al.size()]);
		
		/*int arr[]=new int[al.size()];
		int j=0;
		for(int i:al) {
			arr[j]=i;
			j++;
		}*/
	
	
	System.out.println("array Element:");
	for(int i:arr) {
		System.out.print(i+" ");
	}
		
		
	}

}
