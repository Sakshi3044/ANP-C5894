
/* Example of single level inheritance -
 Create a class called Shape with a method calculateArea() that prints "Calculating area of the shape." 
 Create a child class Rectangle that inherits from Shape and overrides the calculateArea() method 
 to calculate and print the area of a rectangle. */

package oops;

class Shape
{
	public void calculateArea()
	{
		System.out.println(" Calculating area of the shape ");
	}
}
	
	class Rectangle extends Shape
	{
		public void calculateArea()
		{
			System.out.println(" Calculating area of the rectangle ");
		}
	}

class Shapemain

{
	public static void main(String[] args) 
	{
		//creating object of sub class
		Rectangle rect = new Rectangle();
		
		//access fields and methods
		rect.calculateArea();

	}
}


