import java.util.ArrayList;

/*Write a Java program to increase the size of an array list*/
public class M61 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		 list.add("Nirav");
		 list.add("Subham");
		 list.add("Dhurv");
		 list.add("lalit");
		 System.out.println(list);
		 list.ensureCapacity(2);
		 list.add("rajan");
		 list.add("jainik");
		 list.add("sahil");
		 System.out.println(list);
	}
}
