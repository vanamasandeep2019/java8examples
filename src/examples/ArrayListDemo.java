package examples;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
		/*for (String string : list) {
			System.out.println(string);
		}*/
		
		list.forEach(System.out::println);
	}

}
