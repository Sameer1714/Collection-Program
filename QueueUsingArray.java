package ssd;

public class QueueUsingArray {

	static class Queue{
		static int[] arr;
		static int last=0;
		
		public Queue(int size) {
			arr=new int[size];
		}
		public static boolean isEmpty() {
			return last==0;
		}
	 public static  void add(int data) {
	
		   if(last==arr.length){
			 System.out.println("Queue is full"); 
		 }
		  else {
			   arr[last]=data;
			   last++;
		   }
		   
	 }
	 public static int peek() {
		 if(isEmpty()) {
			 System.out.println("Queue is Empty");
			 return -1;
		 }
		 else {
			 return arr[0];
		 }
	 }
	 public static int remove() {
		 
		 if(isEmpty()) {;
			 System.out.println("Queue is Empty");
			 return -1;
		 }
		 int r=arr[0];
		 for(int i=1;i<last;i++) {
			 arr[i-1]=arr[i];
		 }
		 return r;
	 }
	}
	public static void main(String[] args) {
		Queue q=new Queue(5);
		Queue.add(1);
		Queue.add(12);
		Queue.add(23);
		Queue.add(34);
		Queue.add(34);
		
		System.out.println(Queue.remove());
		System.out.println(Queue.remove());
		
		System.out.println("peek : "+Queue.peek());
 
		
		
	}

}
