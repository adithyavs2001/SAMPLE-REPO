package Abstraction;

public class Child extends Parent
{
	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
		obj.print();
		
	}

	@Override
	public void display() {
		int a =20;
		System.out.println(a);
		
	}

	@Override
	public void print() {
		int b=10;
		System.out.println(b);
		
	}
	
	
	}

