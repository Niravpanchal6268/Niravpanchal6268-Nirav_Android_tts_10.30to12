import java.util.Scanner;

/*B41. Write a program to print the area and perimeter of a triangle having 
sides of 3, 4 and 5 units by creating a class named 'Triangle' without any 
parameter in its constructor.*/
class triangle{
	int b,l;
	double ans;
	public triangle(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter B");
		b=sc.nextInt();
		System.out.println("enter L");
		l=sc.nextInt();
		ans=0.5*l*b;
		System.out.println("the area of Triangle::"+ans);
		
	}
	 triangle(int a,int b,int c)
	{
		ans=a+b+c;
		System.out.println("the perimeter  of  triangle"+ans);
	}
}
public class M14 {
	public static void main(String[] args) {
		triangle ta = new triangle();
		triangle tp = new triangle(3, 4, 5);
	  
	
		
	}

}
