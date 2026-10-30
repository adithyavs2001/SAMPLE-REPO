package InterfaceExample;

public class Child implements Parent
{

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
		obj.print();
		
		
		

	}

	@Override
	public void print() {
		int a= 20;
		System.out.println(a);
		
	}

	@Override
	public void display() {
		int b =30;
	
		System.out.println(b);
		
	}

}
