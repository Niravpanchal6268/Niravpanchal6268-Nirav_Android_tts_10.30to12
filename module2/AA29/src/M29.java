import java.util.Scanner;

/*W.A.J.Pto create a custom exception if Customer withdraw amount which 
is greater than account balance then program will show custom exception 
otherwise amount will deduct from account balance.
Account balance is: 2000 Enter withdraw amount: 2500
Sorry, insufficient balance, you need more 500 Rs. To perform this 
transaction*/
 
	  
  
public class M29 {
	public static void main(String[] args) {
			
		try {
			System.out.println("Enter Deposite Amount::");
			Scanner s =  new Scanner(System.in);
		    int Dep=s.nextInt();
		    int Total;
		    if(Dep>2000)
		    {
		    	throw new InsufficientBalanceExceptio();
		    }
		    else {
				Total = 2000-Dep;
				System.out.println("Total Balance is "+Total);
			}
		  
		} catch (InsufficientBalanceExceptio e) {
			System.err.println(e);
		}
	}
}
