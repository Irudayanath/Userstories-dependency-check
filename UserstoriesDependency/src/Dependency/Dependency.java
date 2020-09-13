package Dependency;



import Userstories.Login;
import Userstories.additem;
import Userstories.checkout;
import Userstories.searchcheckout;

public class Dependency {
	
	
	public static void main(String args[])
	{
		Boolean s=Login.Nodedata();
		Boolean b=additem.additempage();
		Boolean c=checkout.checkoutsearch();
		Boolean e=searchcheckout.search();
		
		if(s==true & b==true & c==true & e==true)
		{
			NodeA="Dependency found at Login";
			NodeB="Dependency found at additem";
			NodeC="Dependency found at checkout";
			NodeE="Dependency found at searchcheckout";
			
		}
		else
		{
			NodeA="Dependecy failed at Login";
			NodeB="Dependecy failed at additem";
			NodeC="Dependecy failed at checkout";
		}
		
		
	try
	{
		Node tree=userstoriestree();
		dfs.traversetree(tree);
	}
	catch(Exception se)
	{
		se.printStackTrace();
	}
		
	}
	static String NodeA;
	static String NodeB;
	static String NodeC;
	static String NodeE;
    
	private static Node userstoriestree() {
		Node root=new Node(NodeA,
				new Node(NodeB,
						new Node(NodeC),new Node("D")),
				new Node(NodeE
						
						)
				);
		
		
		// TODO Auto-generated method stub
		return root;
	}
	
	
	
	
}
