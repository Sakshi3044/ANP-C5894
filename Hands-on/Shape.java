
// Example of single level inheritance 

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


