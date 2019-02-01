package project08;

public class Node implements Comparable<Node>{
     private int value;
     private Node leftTree;
     private Node rightTree;
     
     public Node(int value)
     {
    	 this.value=value;
     }

	@Override
	public int compareTo(Node o) {
		return this.value-o.value;
	}
	@Override
	public String toString() {
		
		return "value= "+value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setLeftTree(Node leftTree) {
		this.leftTree = leftTree;
	}
	
	public void setRightTree(Node rightTree) {
		this.rightTree = rightTree;
	}
	
	public Node getLeftTree() {
		return leftTree;
	}
	
	public Node getRightTree() {
		return rightTree;
	}
	
	
}
