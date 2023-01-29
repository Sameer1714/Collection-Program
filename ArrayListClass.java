package ssd;
import java.util.*;
public class ArrayListClass
{
	String name;
	int id;
	public ArrayListClass(String name,int id) {
		this.name=name;
		this.id=id;
	}

	public static void print(ArrayList<String> al)
	{
		System.out.println("\nArrayList : "+al);
	}
	public static void printusingIterator(ArrayList<String> al) {
		
		Iterator<String> itr=al.iterator();
		System.out.println("\nIterate Element Using Iterator : ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static void printUsingForeachLoop(ArrayList<String> al) {
		
		System.out.println("\nIterate Element Using Foreach Loop : ");
		for(String i:al) 
		{
			System.out.print(i+" ");
		}
	}
	public static void printUsingListIterator(ArrayList<Integer> al2) {
		System.out.println("\nIterate Element Using ListIterator : ");
		ListIterator<Integer> ls=al2.listIterator();
		
		while(ls.hasNext()) {
			System.out.println(ls.nextIndex()+" "+ls.next());
		
		}
		System.out.println("\nIterate Element Using For Loop : ");
		for(int i=0;i<al2.size();i++) {
			System.out.println(al2.get(i));
		}
		System.out.println("\nIterate Element Using forEach METHOD : ");
		al2.forEach(a->{
			System.out.println(a);
		});
		System.out.println("\nIterate Element Using forEachRemaining : ");
		Iterator<Integer> itr=al2.iterator();
		itr.forEachRemaining(a->{
			System.out.println(a);
		});
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("sameer");
		al.add("sd");
		al.add("Aniket");
		al.add("Subodh");
		
		print(al);
		printusingIterator(al);
		printUsingForeachLoop(al);
		
		al.set(0, "Sameer Domale");
		print(al);
		
		ArrayList<Integer> al2=new ArrayList<>();
		al2.add(10);
		al2.add(30);
		al2.add(2);
		al2.add(67);
		
		Collections.sort(al2);
		printUsingListIterator(al2);
		
		
		ArrayListClass ac1=new ArrayListClass("sameer", 101);
		
		ArrayList<ArrayListClass> al3=new ArrayList<>();
		al3.add(ac1);
		System.out.println(al3);
		
		for(ArrayListClass a:al3) {
			System.out.println(a.name+" "+a.id);
		}
		
		

	}

}
