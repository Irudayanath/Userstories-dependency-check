package Dependency;

public class dfs {
static void traversetree(Node node)
{
	if(node==null)
	{
		return;
	}
	Node current;
	String data;
	System.out.print(node.data);
	
	traversetree(node.right);
	if(node.left==new Node("B"))
	{
		current=node.left;
		data=node.data;
	}
	if(node.left==new Node("C"))
	{
	     current=node.left;
	}
	
	if(node.left==null)
	{
		current=node.left;
	}
	traversetree(node.left);
	if(node.right==new Node("E"))
	{
		current=node.right;
	}
}

}
