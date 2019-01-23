package com.otherapi.calendar;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class CalendarDemo {

	
	@Test
	public void calendarTest1(){
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		System.out.println(date);
	}
	
	@Test
	public void calendarTest2(){
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, 2);
		System.out.println(c.getTime());
	}
	@Test
	public void calendarTest3(){
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
	}

	@Test
	public void calendarTest4(){
		Calendar c = Calendar.getInstance();
		String year = String.valueOf(c.get(Calendar.YEAR));
		String month = String.valueOf(c.get(Calendar.MONTH)+1);
		String day = String.valueOf(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(year+""+month+""+day);

	}
	
}
