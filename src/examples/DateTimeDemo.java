package examples;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeDemo {
	
	public static void main(String[] args) {
		DateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date=new Date();
		System.out.println(sdf.format(date));
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now=LocalDateTime.now();
		System.out.println("Using Java8"+df.format(now));
		
		
	}

}
