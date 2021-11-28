import java.util.*;
class TreeNode{
	private Integer data;
	private TreeNode leftNode;
	private TreeNode rightNode;
	
	public TreeNode(Integer data){
		this.data=data;
	}
	public void setLeft(TreeNode leftNode){
		this.leftNode=leftNode;
	}
	public void setRight(TreeNode rightNode){
		this.rightNode=rightNode;
	}
	public TreeNode getLeft(){
		return this.leftNode;
	}
	public TreeNode getRight(){
		return this.rightNode;
	}
	public Integer getData(){
		return this.data;
	}
	public int height(TreeNode root){
		if(root == null) return 0;
		
		int leftHeight = height(root.leftNode);
		int rightHeight = height(root.rightNode);
		
		return 1+ (leftHeight > rightHeight ? leftHeight : rightHeight);
	}
	
	public TreeNode find(Integer data){
		if(this.data==data){
			return this;
		}
		if(data<this.data && this.leftNode != null){
			return this.leftNode.find(data);
		}
		if(this.rightNode != null){
			return this.rightNode.find(data);
		}
		return null;
	}
	
	public int search(int data){
		if(this.data == data){
			return 1;
		}
		if(data > this.data){
			return 2*this.rightNode.search(data) + 1;
		}
		if(data < this.data){
			return 2*this.leftNode.search(data);
		}
		return -1;
	}
	public void inOrder(){
		if(this.getLeft() != null)
			this.leftNode.inOrder();
		System.out.print(this.getData()+" ");
		if(this.getRight() != null)
			this.rightNode.inOrder();
	}
	public void insert(Integer data){
		if(data>=this.data ){
			if(this.rightNode==null){
				this.rightNode=new TreeNode(data);
			}
			else
				this.rightNode.insert(data);
		}
		else{
			if(this.leftNode==null){
				this.leftNode=new TreeNode(data);
			}
			else{
				this.leftNode.insert(data);
			}
		}
	}
	
	
}
class BinarySearchTree{
	private TreeNode root;
	
	public TreeNode getRoot(){
		return this.root;
	}
	public void insert(Integer data){
		if(this.root==null){
			this.root=new TreeNode(data);
		}
		else
			this.root.insert(data);
	}
	public TreeNode find(Integer data){
		return this.root.find(data);
	}
	public void inOrder(){
		if(this.root != null)
			this.root.inOrder();
		System.out.println();
		
	}
	public int heightOfTree(){
		return this.root.height(this.root);
	}
	
	public int treeSearch(int data){
		if(this.root == null){
			return 0;
		}
		return this.root.search(data);
		
	}
	
	public void delete(Integer data){
		TreeNode current=this.root;
		TreeNode parent=this.root;
		boolean isLeftChild=false;
		if(current == null){
			return;
		}
		while(current !=null && current.getData()!=data){
			parent = current;
			if(current.getData() > data){
				current = current.getLeft();
				isLeftChild=true;
			} else{
				current = current.getRight();
				isLeftChild = false;
			}
		}
		if(current == null){
			return;
		}
		if(current.getLeft() == null && current.getRight() == null){	// Case1:
			if(current == root){
				root = null;
			}else{
				if(isLeftChild == true)
					parent.setLeft(null);
				else
					parent.setRight(null);	
			}
		}
		else if(current.getRight() == null){						   // case2: 
			if(current == root)
				root = current.getLeft();
			else if (isLeftChild)
				parent.setLeft(current.getLeft());
			else
				parent.setRight(current.getLeft());
		}
		else if(current.getLeft() == null){
			if(current == root)
				root = current.getRight();
			else if(isLeftChild)
				parent.setLeft(current.getRight());
			else
				parent.setRight(current.getRight());
		}
		else {														// case3:
			TreeNode successor = getSuccessor(current);
			if(current == root)
				root = successor;
			else if(isLeftChild)
				parent.setLeft(successor);
			else
				parent.setRight(successor);
		}
	}
	private TreeNode getSuccessor(TreeNode node){					//partOfCase3:
		TreeNode parentOfSuccessor = node;
		TreeNode successor = node;
		TreeNode current = node.getRight();
		while(current != null){
			parentOfSuccessor = successor;
			successor = current;
			current = current.getLeft();
		}
		if(successor.getRight() != null){
			parentOfSuccessor.setRight(successor.getRight());
			successor.setRight(node.getRight());
		}
		return successor;
	}
	
}
class Demo{
	public static void main(String[] args){
		BinarySearchTree t=new BinarySearchTree();
		t.insert(10);
		t.insert(12);
		t.insert(1);
		t.insert(2);
		t.insert(11);
		t.insert(13);
		t.insert(15);
		System.out.println(t.treeSearch(2));
		System.out.println(t.find(10).getData());
		System.out.println(t.heightOfTree());
		System.out.println(t.getRoot().getData());
		System.out.println(t.getRoot().getLeft().getData());
		System.out.println(t.getRoot().getLeft().getRight().getData());
		t.delete(2);
		System.out.println(t.getRoot().getLeft().getRight());
				
	}
}