class Node{
	private int data;
	private Node nextNode;
	private Node previousNode;
	
	public Node(int data){
		this.data=data;
	}
	public int getData(){
		return this.data;
	}
	public Node getNextNode(){
		return this.nextNode;
	}
	public Node getPreviousNode(){
		return this.previousNode;
		
	}
	public void setData(int data){
		this.data=data;
	}
	public void setNextNode(Node nextNode){
		this.nextNode = nextNode;
	}
	public void setPreviousNode(Node previousNode){
		this.previousNode=previousNode;
		
	}
	 
	 
	 public String toString(){
		return "data: "+this.data;
	 }
}
class LinkedList{
	private Node head;
	public void insertAtHead(int data){
		Node newNode=new Node(data);
		newNode.setNextNode(this.head);
		if(this.head!=null){
			this.head.setPreviousNode(newNode);
		}
		this.head=newNode;
	}
	
	public void listSort(){
		Node black =this.head.getNextNode();
		Node green =this.head;
		Node current =black;
		while((black.getData()>green.getData() || green == null) && current!=null){
			if(green==null){
				current=black.getNextNode();
				green = this.head;
				green.setNextNode(black.getNextNode());
				black.getNextNode().setPreviousNode(green);
				black.setNextNode(green);
				green.setPreviousNode(black);
				black.setPreviousNode(green.getPreviousNode());
				this.head=black;
			}
			else{
				current=black.getNextNode();
				black.getPreviousNode().setNextNode(black.getNextNode());
				if(black.getNextNode()!=null){
					black.getNextNode().setPreviousNode(black.getPreviousNode());
				}
				black.setPreviousNode(green);
				black.setNextNode(green.getNextNode());
				green.getNextNode().setPreviousNode(black);
				green.setNextNode(black);
				
			}
			black=current;
			green=current.getPreviousNode();
			
		}
		
		
	}
	
	 
	 public String toString(){
		Node current=this.head;
		String result="[ ";
		while(current!= null){
			result+=current.getData()+", ";
			current=current.getNextNode();
		}
		
		return result+" ]";
		
	 } 
}

class Demo{
	public static void main(String[] args){
		LinkedList list=new LinkedList();
		
		list.insertAtHead(5);
		list.insertAtHead(2);
		list.insertAtHead(4);
		list.listSort();
		System.out.println(list);
		
	}
}