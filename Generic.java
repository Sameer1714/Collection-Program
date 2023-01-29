package ssd;

public class Generic {
	private static <t>void print(t i) {
		System.out.println(i);	
	}
	private static <m>void printArray(m[] array) {
		for(m i:array) {
			System.out.println(i);}		
	}
	public static void main(String[] args){
		print(8);
		print(10.3f);
		print("sameer");
		print('a');
		
		System.out.println("\nPrinting Integer Array: ");
		Integer[] arr= {10,2,34,67,78};
		printArray(arr);
		
		System.out.println("\nPrinting String Array: ");
		String[] str= {"sameer","aniket","subodh"};
		printArray(str);
		
		System.out.println("\nPrinting Character Array: ");
	     Character[] c= {'s','a','m','e','e','r'};
		printArray(c);
		
		System.out.println("\nPrinting Float Array: ");
		Float[] f= {10.2f,30.3f,56.8f};
		printArray(f);
		
		System.out.println("\nPrinting Double Array: ");
		Double[] d= {10.22,77.60,57.54};
		printArray(d);
	}
}
