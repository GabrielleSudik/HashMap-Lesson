import java.util.HashMap;
import java.util.Map;

//maps are a java collection. hashmaps are a type of map
//they are key-value matches

public class Application {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5,  "five");
		map.put(4,  "four");
		map.put(9,  "nine");
		map.put(6,  "six");
		map.put(7, "six");
		map.put(6,  "surprise");
		
		String text = map.get(4);
		System.out.println(text);
		
		String text2 = map.get(1);
		System.out.println(text2); //print null
		
		String text3 = map.get(7);
		System.out.println(text3); //prints six.
			//you can have the same value be attached to more than one key
		
		String text4 = map.get(6);
		System.out.println(text4); //prints "surprise"
			//but you can have only one key per value
			//so using 6 twice above -- the latter overrides the former
		
		for (Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + " : " + value);
	
		}	

	}

}
