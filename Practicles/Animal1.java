	package oops;
	
	//Example of Abstraction
	abstract class Animal1
	{
		//contains abstract method
		//Abstract method does not have body
		public abstract void sound();
		
		//can contain non abstract method
		public void sleep()
		{
			System.out.println("Animals Sleep....");
		}
	}
	
	//subclass inherits Animals
	class Monkey1 extends Animal1
	{
		public void sound()
		{
			System.out.println("Monkey sounds like human....");
		}	
	}
	class Animal1Main
	{
		public static void main(String[] args)
		{
			Monkey1 m=new Monkey1();
			m.sound();
			m.sleep();
		}
	}