package api.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = new GregorianCalendar();
		System.out.println(cal);

		System.out.print(cal.get(Calendar.YEAR)+"�� ");
		System.out.print((cal.get(Calendar.MONTH) +1 )+"�� ");
		System.out.print(cal.get(Calendar.DATE)+"�� ");
		System.out.print(cal.get(Calendar.HOUR)+"�� ");
		System.out.print(cal.get(Calendar.MINUTE)+"�� ");
		System.out.println(cal.get(Calendar.SECOND)+"�� ");

		System.out.println(cal.getTimeInMillis());
		
		
		Calendar today =  new GregorianCalendar();
		Calendar next = new GregorianCalendar();
		next.set(2021, 8, 21);
		
		long diff= next.getTimeInMillis() - today.getTimeInMillis();
		System.out.println(diff/1000/60/60/24);
		
	}

}
