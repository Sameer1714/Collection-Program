package ssd;

import java.util.Stack;

public class StackLegacyClass {

	public static void main(String[] args)
	{
		Stack<Integer> s=new Stack<>();
		
		System.out.println(s.empty());
		
		s.push(1);
		s.push(2);
		s.push(23);
		s.push(35);//top most Element
		
		System.out.println(s);
		s.pop();//remove top most Element : 35
		
		System.out.println(s);
		
		System.out.println(s.peek());//it only print top most Element
		
		System.out.println(s);
		
		System.out.println(s.search(1));//it return its indexi

	}

}
