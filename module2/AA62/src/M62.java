import java.util.ArrayList;
/*Write a Java program to replace the second element of an ArrayList with 
the specified element.*/
public class M62 {
	public static void main(String[] args) {
			
	ArrayList list =new ArrayList();
	list.add("aa");
	list.add("bb");
	list.add("cc");
	System.out.println("original list"+list);
	 String s= "AA";
	 list.set(0, s);
	 System.out.println("replace first element::"+list);
			
	}
}
