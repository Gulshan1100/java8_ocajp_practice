import java.util.*;
class Queue{
	private int arr[];
	private int head=-1;
	private int tail=-1;
	
	public Queue(int size){
		this.arr=new int[size];
	}
	public int getHead(){
		return this.head;
	}
	public int getTail(){
		return this.tail;
	}
	public void enqueue(int data){
		if(this.head == -1){
			this.head++;
		}
		if(this.tail==this.arr.length-1 && Math.abs(this.tail-this.head)<this.arr.length){
			this.tail=0;
		}
		else{
			this.tail++;
		}
		this.arr[tail]=data;
	}
	public void dequeue(){
		this.arr[head]=0;
		this.head++;
	}
	public int peek(){
		return this.arr[tail];
	}
	
	public String toString(){
		return Arrays.toString(this.arr);
	}
}
class Demo{
	public static void main(String[] args){
		Queue q=new Queue(5);
		q.enqueue(10);
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(14);
		q.dequeue();
		q.enqueue(17);
		
		System.out.println(q);
	}
}