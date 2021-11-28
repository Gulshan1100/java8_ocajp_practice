import java.util.*;
class Stack{
	private int arr[];
	private int top=-1;
	
	public Stack(int size){
		this.arr=new int[size];
	}
	public int getTop(){
		return this.top;
	}
	
	public String toString(){
		String s="{ ";
		for(int i=0;i<=top;i++){
			s+=this.arr[i]+", ";
		}
		s=s+" }";
		return s;
	}
	
	public void push(int data){
		if(this.top!=this.arr.length){
			this.top++;
			this.arr[top]=data;
		}
		else{
			System.out.println("Stack is full ");
		}
	}
	public int peek(){
		if(this.top!=-1){
			return this.arr[top];
		}
		else{
			System.out.println("Stack is empty ");
		}
		return 0;
	}
	public void pop(){
		if(this.top!=-1){
			this.arr[top]=0;
			this.top--;
		}
		else{
			System.out.println("Stack is empty ");
		}
	}
}
class Demo{
	public static void main(String[] args){
		Stack s=new Stack(10);
		
		s.pop();
		s.push(11);
		s.push(12);
		s.push(15);
		s.pop();
		
		System.out.println(s);
		System.out.println(s.peek());
		
	}
}		
	




























	
	
	
	
	
	