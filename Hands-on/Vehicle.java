
/* Example of Multilevel inheritance -
  Create a class called Vehicle with attributes brand and year. 
  Implement a method displayInfo() in the Vehicle class that prints the brand and year of the vehicle. 
  Create a child class Car that inherits from Vehicle and adds an attribute model. 
  Create another child class SportsCar that inherits from Car and adds an attribute topSpeed. 
  Override the displayInfo() method in the SportsCar class to display the brand, model, year, and top speed of the sports car */

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
