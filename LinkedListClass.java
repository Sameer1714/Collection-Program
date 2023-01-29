package ssd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

class Book{
	int id;  
	String name,author,publisher;  
	int quantity;  
	public Book(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}
}

public class LinkedListClass {

	public static void main(String[] args) {
		
		Book b1=new Book(101,"sam","Xyz","SSD",345);
		Book b2=new Book(101,"sa","ABC","DSE",123);
		Book b3=new Book(101,"samee","PQR","FGT",678);

		
		
		LinkedList<Book> ls=new LinkedList<Book>();
		
		
		
		
		
		LinkedList<String> ls2=new LinkedList<>();
		
		System.out.println("ls2 : "+ls2);
		

		ls.add(b1);
		ls.add(b2);
		ls.add(b3);
		
		for(Book b:ls) {
			System.out.println(b.id+" "+b.author+" "+b.name+" "+b.publisher+" "+b.quantity);
		}
		
		
		
		System.out.println(ls);
		ls2.addLast("Zebra");
		ls2.set(0, null);
		ls2.add(1,"ssd");
		ls2.remove(1);
		Iterator<String> itr=ls2.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ArrayList<Integer> as=new ArrayList<>();
		as.add(10);
		as.add(20);
		as.add(2);
		as.add(34);
		
		
		Integer[] arr=as.toArray(new Integer[as.size()]);
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
