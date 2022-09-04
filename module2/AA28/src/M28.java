import java.nio.channels.NonReadableChannelException;
import java.util.Scanner;

/*W.A.J.P to create the validate method that takes integer value as a 
parameter. If the age is less than 18, then throw an ArithmeticException 
otherwise print a message welcome to vote.
O/P- Enter your age: 16
Exception in thread main java. lang. ArithmeticException: not valid
*/
class vote{
	void validate(int age)
	{
//		int a= age;
		
		if (age>=18)
		{
				System.out.println("welcome to vote");
		}
		else {
			throw new ArithmeticException();
		}
	}
}
public class M28 {
	public static void main(String[] args) {
		 
		 vote v = new vote();
		 System.out.println("Enter Your Age::");
		 Scanner sc= new Scanner(System.in);
		 int a=sc.nextInt();
		try {
			v.validate(a);
			
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
