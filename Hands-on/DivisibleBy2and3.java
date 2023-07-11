/* write a java program that takes an integer as input ad checks if it is divisible by 2 & 3 or both.
   print " Divisible by 2" if it is divisible by 2, print " Divisible by 3" if it is divisible by 3 and 
   "Divisible by both 2 & 3" if it is divisible by both */

package loops;
import java.util.*;
public class DivisibleBy2and3 
{

	public static void main(String[] args) 
	{
				//Scanner class to take input from the user
				Scanner s = new Scanner(System.in);
				System.out.println("Enter a Number:");
				
				//integer input from the user 
				int a=s.nextInt();
				
				//condition
					if(a%2==0 && a%3==0 )
					{
						System.out.println("Number is Divisible by both 2 & 3");

					}
					
					else if(a%2==0 )
					{
						System.out.println("Number is Divisible by 2");

					}
					
					else if( a%3==0 )
					{
						System.out.println("Number is Divisible by 3");

					}
					
					else 
					{
						System.out.println("Number is not Divisible by both 2 & 3");

					}
					s.close();
	}

}
