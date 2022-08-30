import java.util.HashSet;

/*Write a Java program to compare two sets and retain elements which are 
same on both sets. */
public class M64 {
	public static void main(String[] args) {
			
		HashSet list1= new HashSet();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		System.out.println("first list"+list1);
		
		HashSet list2 = new HashSet<>();
		list2.add(1);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(5);
	System.out.println("list 2"+list2);
		list1.retainAll(list2);
		System.out.println(list1);
		
		
		
		
		
	}
}