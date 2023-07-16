	
	/*
	Write a Java program that asks the user to enter a series of numbers (positive or negative) and 
	calculates their sum. The program should stop asking for input when the user enters 0. 
	Use a do-while loop to continuously ask for numbers and keep adding them to the sum.
	*/
	
	package loops;
	
	import java.util.Scanner;
	
	public class CalculateSum 

	 {
	    public static void main(String[] args) 
	    
	    {
	    	// Create a Scanner object to read user input
	        Scanner scanner = new Scanner(System.in); 
	        
	        // Variable to store the entered number
	        int number; 
	        
	        // Variable to store the sum of the numbers
	        int sum = 0; 
	        
	        do 
	        {
	        	// Prompt the user to enter a number
	            System.out.print("Enter a number (or 0 to exit): "); 
	            
	            // Read the entered number from the user
	            number = scanner.nextInt(); 
	            
	            // Add the entered number to the sum
	            sum += number; 
	        }
	        
	        // Repeat the loop as long as the entered number is not zero
	        while (number != 0); 
	        
	        // Print the final sum
	        System.out.println("The sum is: " + sum); 
	        
	        // Close the Scanner object
	        scanner.close(); 
	    }
	}
