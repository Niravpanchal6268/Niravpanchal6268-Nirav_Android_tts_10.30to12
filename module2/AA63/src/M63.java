import java.util.ArrayList;
import java.util.Iterator;

/*Write a Java program to print all the elements of an ArrayList using the 
position of the elements.*/
public class M63 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		 list.add("c");
		 list.add("c++");
		 list.add("python");
		 list.add("css");
		 System.out.println(list);
		 int  l1=list.size();
		for(int i=0;i<l1;i++)
		{
			System.out.println(list.get(i));
		}
	}
}
