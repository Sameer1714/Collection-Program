package ssd;

import java.util.ArrayDeque;

public class ArrayDequeClass {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ar=new ArrayDeque<>();
		ar.add(12);
		ar.offer(34);
		ar.offerFirst(1);
		System.out.println(ar);
		ar.offerLast(23);
		System.out.println(ar);
		ar.poll();
		System.out.println(ar);
		ar.pollLast();
		System.out.println(ar);
		

	}

}
