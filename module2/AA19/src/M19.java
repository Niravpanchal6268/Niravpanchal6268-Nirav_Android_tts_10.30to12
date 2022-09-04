import java.util.Scanner;

/*Write a program to print the factorial of a number by defining a method 
named 'Factorial'. Factorial of any number n is represented by n! and is 
equal to 1*2*3*. *(n-1) *n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also, 1! = 1
0! = 0*/
class fact{
	 
	int Factorial (int n)
	{
		if(n==0)
		return 1;
		return n *Factorial(n-1);
		
		
	}
	
}
public class M19{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		fact f1= new fact();
		
		System.out.println("factorial: "+f1.Factorial(num));
		
	}
}