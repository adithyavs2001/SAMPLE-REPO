package access;

public class Access1 
{
	public void diplay()
	{
		System.out.println("public");
	}
private void display1()
{
	System.out.println("private");
}

	protected void display2()
	{
		System.out.println("protected");
	}
	
		void display3()
		{
			System.out.println("default");
			
		}
		public static void main (String args[])
		{
			Access1 obj=new Access1();
			obj.diplay();obj.display2();
			obj.diplay();
			obj.display1();
			obj.display3();
					
		}
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

