import java.util.HashMap;

/*Write a Java program to get a collection view of the values contained in 
this map.
*/
public class M65 {
		public static void main(String[] args) {
		
			HashMap h1 = new HashMap<>();
			h1.put(1,"nirav");
			h1.put(2, "raj");
			h1.put(3, "dhurv");
			h1.put(4, "lalit");
			h1.put(5, "jainik");
		
			System.out.println("collection view:"+h1.values());
		
		}
		
}
