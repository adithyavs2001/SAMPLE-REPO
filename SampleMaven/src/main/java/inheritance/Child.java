package inheritance;

public class Child extends Parent

{
	public void child()
{
	System.out.println("This is  the child class");
}

	public static void main(String[] args)
	{
		Child obj=new Child ();
		obj.grandparent();
		obj.parent();
		obj.child();
		// TODO Auto-generated method stub

	}

}
