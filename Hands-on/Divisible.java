/* simple If Else program that takes an integer as input and checks if it is divisible by 5 and 11. 
   print "divisible" by both and "not divisible" otherwise */

package loops;
import java.util.*;
public class Divisible

	{
			public static void main(String[] args)
			{
				
			//Scanner class to take input from the user
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a Number:");
			
			//integer input from the user 
			int a=s.nextInt();
			
			//condition
			if(a%5==0 && a%11==0)
			{
				System.out.println("Divisible");

			}
			else 
			{
				System.out.println(" Not Divisible");
			}
			s.close();
			}
	}