package Dependency;

public class Node {
	Node right;
	Node left;
	String data;
public Node(String data)
{
	this.data=data;
}
		public Node(String data,Node right,Node left)
		{
			this.data=data;
			this.right=right;
			this.left=left;
		}
}
