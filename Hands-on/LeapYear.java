/* write a java program that takes a year as input and checks if it is a leap year.
   if the year is divisible by 4, check if it is also divisible by 100, check if it is also divisible by 400.
   print " Leap year" if it satisfies all the conditions, and "Not a Leap Year " otherwise. */

package loops;
import java.util.*;
public class LeapYear 
{

	public static void main(String[] args) 
	{
		//Scanner class to take input from the user
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Year:");
		
		//integer input from the user 
		int a=s.nextInt();
		
		//condition
		if(a%4==0)
		{
			System.out.println(" Leap Year ");

		}
		
		else if(a%100==0)
		{
			System.out.println(" Leap Year ");

		}
		
		else if(a%400==0)
		{
			System.out.println(" Leap Year ");

		}
		
		else 
		{
			System.out.println("  Not a Leap Year ");

		}
		s.close();
		
	}

}
