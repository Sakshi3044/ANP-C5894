
// Example of Multilevel inheritance 

package oops;
class Vehicle 
{
	String brand;
	int year;
		public void displayInfo()
		{
			System.out.println("Brand and year of the vehicle ");
		}	
}

class Car extends Vehicle
{
	String model;
		//public void displayInfo()
		{
			System.out.println("Brand and year of the vehicle ");
		}	
}

class SportsCar extends Car
{
	int topSpeed;
		public void displayInfo()
		{
			System.out.println("Brand, year, model and top speed of the sports car ");
		}
}

class Vehiclemain
{
	public static void main(String[] args) 
	{
		
	//creating object of sub class
		
	 SportsCar sc = new SportsCar();
	 sc.brand ="Audi" ;
	 sc.model =" 12A ";
	 sc.year = 2023;
	 sc.topSpeed = 200;
	 sc.displayInfo();
	 
	 //access fields and methods
			 
     System.out.println("Brand name : "+ sc.brand );
     System.out.println("year : "+ sc.year );
	 System.out.println("Model name : "+ sc.model );
	 System.out.println("topSpeed : "+ sc.topSpeed );
	
	}
}
