package Polymorphism;

public class Dog extends Animal
{
	public void sound()
	{
		System.out.println("dog barks");
		super.sound();
	}
	

	public static void main(String[] args) {
		
Dog obj=new Dog();
obj.sound();
	}

}
