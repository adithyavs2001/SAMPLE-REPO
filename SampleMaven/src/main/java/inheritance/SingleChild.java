package inheritance;

public class SingleChild extends SingleParent{
	public void child()
	{
		System.out.println("This is a child class");
	}
	
public static void main(String[] args) {
	SingleChild obj=new SingleChild();
	obj.child();
	obj.parent();
	
}
}
