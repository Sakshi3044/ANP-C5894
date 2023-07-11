
/*simple If Else program that takes an integer as input and checks if it is positive or negative. 
  print "positive" if the number is greater than 0 and print "Negative" if it is less than 0 */

package loops;
import java.util.*;
public class IFE

	{
			public static void main(String[] args)
			{
			//Scanner class to take input from the user
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a Number:");
			
			//integer input from the user 
			int a=s.nextInt();
			
			//condition
			if(a>=0)
			{
				System.out.println("Number is positive");

			}
			else 
			{
				System.out.println("Number is Negative");
			}
			s.close();
			}
	}

