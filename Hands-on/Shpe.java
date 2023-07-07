
//Example of Abstraction

package oops;

abstract class Shpe 
{
	//abstract method of calculateArea
    abstract void calculateArea();
    
    //abstract method of calculatePerimeter
    abstract void calculatePerimeter();
}

//subclass inherits from class shpe

class Rectangle1 extends Shpe 
{
     double length =74 ;
     double width=12 ;
    
    public void calculateArea() 
    {
    	System.out.println("Area of rectangle :" + (length * width));
    	
    }
   
    public void calculatePerimeter() 
    {
    	System.out.println("Perimeter of rectangle :"+ 2*(length + width));
    	
    }
}

class Circle extends Shpe 
{
    private double radius =8 ;
    private final double PI = 3.14159;
    
    
    public void calculateArea() 
    {
    	System.out.println("Area of circle :" + (PI * radius * radius));
    }
    
    public void calculatePerimeter() 
    {
    	System.out.println("Perimeter of circle :"+ (2 * PI * radius));
    }
}


class Triangle extends Shpe
{
    double side1 =12 ;
    double side2 =11 ;
    double side3 =10 ;
    
    public void  calculateArea() 
    {
    	System.out.println("Area of triangle :"+ 1/2*(side1 + side2 + side3));
        
    }
  
    public void  calculatePerimeter() 
    {
    	System.out.println("Perimeter of triangle :"+ (side1 + side2 + side3));
    }
}


 class ShpeMain 
{
    public static void main(String[] args) 
    {
    	//creating instance of subclass rectangle
        Rectangle1 r = new Rectangle1();
        
        //access methods
        r.calculateArea();
        r.calculatePerimeter();
        
        //creating instance of subclass circle
        Circle c = new Circle();
        
        //access methods
        c.calculateArea();
        c.calculatePerimeter();
        
        //creating instance of subclass triangle
        Triangle t = new Triangle ();
        
        //access methods
        t.calculateArea();
        t.calculatePerimeter();
        
        
    }
}
