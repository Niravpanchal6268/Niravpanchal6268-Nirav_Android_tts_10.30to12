import java.util.Scanner;


/*W.A.J.P to read 10 integer values using Scanner class from keyboard. 
Generate the exception if the entered value is less than 10 and or greater 
than 40. Program should display appropriate message as and when this 
exception occurs otherwise it will display all the entered values.
*/
class demoException extends Exception
{

	public demoException(String string) {
		// TODO Auto-generated constructor stub
	}
	
}
public class M27 {
	 public static void main(String[] args) {
		try {
			System.out.println("Enter Number::");
			Scanner  sc = new Scanner(System.in);
			int no=sc.nextInt();
			
			 
			int ans=no/0;
			
     	throw new demoException("not vaild");
				
		} catch (demoException e)
		{
		System.out.println(e);	// TODO: handle exception
		}
	}
}
