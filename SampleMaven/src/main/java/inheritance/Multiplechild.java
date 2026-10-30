package inheritance;

public class Multiplechild implements Parent1,Parent2
{

	public static void main(String[] args) {
		Multiplechild obj=new Multiplechild();
		obj.display();
		obj.print();
				
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("displaymethod");
		
	}

	@Override
	public void print() {
		System.out.println("print method");
	}

}
