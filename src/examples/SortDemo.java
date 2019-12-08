package examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDemo {
	
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("hi","hello","java","streams","apple");
		System.out.println("Before sorting"+list);
		List<String> sortedList=list.stream().sorted().collect(Collectors.toList());
		System.out.println("After sorting"+sortedList);
		
		List<String> reverseList=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("After reverse"+reverseList);
		
		
		
	}

}
