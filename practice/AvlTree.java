import java.util.*;
class Node{		//AvlNodeClass
	int data;
	Node leftNode;
	Node rightNode;
	int height;
	
	public Node(int data){
		this.data = data;
		height = 1;
	}
	
}
class AvlTree{		// AvlTreeClass
	Node root;
	
	int height(Node n){		// heightOfNodeMethod
		if(n == null){
			return 0;
		} 
			return n.height;
		
	}
	
	int max(int a, int b){
		return a>b ? a : b ;
		
	}
	
	Node rightRotate(Node y){		//MethodForRightRotate
		Node x = y.leftNode;
		Node T2 = x.rightNode;
		
		x.rightNode = y;
		y.leftNode = T2;
		
		y.height = max(height(y.leftNode),height(y.rightNode)) +1;
		x.height = max(height(x.leftNode),height(x.rightNode)) +1;
		
		return x;
		
	}
	Node leftRotate(Node x){		//MethodForLeftRotation
		Node y = x.rightNode;
		Node T2 = y.leftNode;
		
		y.leftNode = x;
		x.rightNode = T2;
		
		y.height = max(height(y.leftNode),height(y.rightNode)) + 1;
		x.height = max(height(x.leftNode), height(x.rightNode)) + 1;
		
		return y;
		
	}
	int getBalance(Node n){			//MethodForBalancingFactor
		if(n == null){
			return 0;
		}
			return height(n.leftNode) - height(n.rightNode);
		
	}
	Node insert(Node node,int data){
		if(node == null){			// 1. simple BST insert
			System.out.println("null");
			return (new Node(data));
		}
		if(node.data > data ){
			System.out.println("LeftNull");
			node.leftNode = insert(node.leftNode,data);
		} else if(node.data < data){
				System.out.println("RightNull");
			node.rightNode = insert(node.rightNode,data);
		}
		else return node;
		
		node.height = 1 + max(height(node.leftNode),height(node.rightNode));		//2. set height of parent nodes
		
		int balance = getBalance(node);			//3. balaceFactor 
		
		// if node is unbalanced then cases
		
		if(balance < -1 && data > node.rightNode.data){		// case: RIGHT-RIGHT
				System.out.println("RIGHT-RIGHTNull");
			return leftRotate(node);
		}
		if(balance > 1 && data < node.leftNode.data){		// case: LEFT-LEFT
			System.out.println("LEFT-LEFTNull");
			return rightRotate(node);
		}
		if(balance < -1 && data < node.rightNode.data){		// case: RIGHT-LEFT
			System.out.println("RIGHT-leftNull");
			node.rightNode = rightRotate(node.rightNode);
			return leftRotate(node);
		}
		if(balance > 1 && data > node.rightNode.data){		//case: LEFT-RIGHT
			System.out.println("left-RIGHTNull");
			node.leftNode = leftRotate(node.leftNode);
			return rightRotate(node);
		}
		
		return node;										// reuturning new parent node and root node
	}
	
	void preOrder(Node node){
		if(node != null){
			System.out.println(node.data + " " + node.height );
			preOrder(node.leftNode);
			preOrder(node.rightNode);
		}
	}
	
	public static void main(String args[]){
		AvlTree n = new AvlTree();
		
		n.root = n.insert(n.root , 10);
		n.root = n.insert(n.root , 20);
		n.root = n.insert(n.root , 30);
		n.root = n.insert(n.root , 40);
		n.root = n.insert(n.root , 50);
		n.root = n.insert(n.root , 25);
		
		n.preOrder(n.root);
	}
}