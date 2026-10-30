package inheritance;

public class Hchild1 extends Hparent
{
	public void child1()
	{
		System.out.println("This is child1 class");
	}

	public static void main(String[] args) 
	{
		Hchild1 obj=new Hchild1();
		obj.parent();
		obj.child1();
		
		// TODO Auto-generated method stub

	}

}
