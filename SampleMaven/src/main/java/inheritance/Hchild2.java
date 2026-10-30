package inheritance;

public class Hchild2 extends Hparent
{
	public void child2()
	{
		System.out.println("This is child2 class");
	}

	public static void main(String[] args) 
	{
		Hchild2 obj=new Hchild2();
		obj.parent();
		obj.child2();
		
		// TODO Auto-generated method stub

	}

}
