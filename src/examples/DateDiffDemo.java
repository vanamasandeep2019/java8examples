package examples;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateDiffDemo {
	
	public static void main(String[] args) {
		
		LocalDateTime d1=LocalDateTime.of(2020,12,1,11,20,20);
		
		LocalDateTime d2=LocalDateTime.of(2019,12,1,10,20,20);
		
		Duration duration=Duration.between(d2, d1);
		
		System.out.println(duration.getSeconds());
		
		LocalDate d3=LocalDate.of(2020,12,1);
		
		LocalDate d4=LocalDate.of(2019,11,1);
		
		Period period=Period.between(d4, d3);
		
		System.out.println("Number of days="+period.getDays());
		
		System.out.println("Number of Years="+period.getYears());
		
		System.out.println("Number of Months="+period.getMonths());
		
	}

}
