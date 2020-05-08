package examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> map=new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);
		
		/*for(Map.Entry<String,Integer> entry : map.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}*/
		
		map.forEach((k,v)-> System.out.println("key="+k+"Value="+v));
	}

}
