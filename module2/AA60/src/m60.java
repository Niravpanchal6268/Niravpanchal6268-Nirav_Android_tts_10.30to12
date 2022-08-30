import java.util.HashMap;

/*Write a Java program to check whether a map contains key-value 
mappings (empty) or not.*/
public class m60 {
	public static void main(String[] args) {
		HashMap hs = new HashMap<>();
		hs.put(1, "Maninagar");
		hs.put(2, "Naroda");
		hs.put(3, "Chandkheda");
		hs.put(4, "kalupur");
		hs.put(5, "Ranip");
		
//		boolean ans = hs.isEmpty();
//		 hs.clear();
		 boolean ans= hs.isEmpty();
		System.out.println(ans);
	}
}
