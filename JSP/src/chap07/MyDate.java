package chap07;

import java.util.GregorianCalendar;

public class MyDate {

	public static String printNow() {
		
		GregorianCalendar now = new GregorianCalendar();
		String nowDate = String.format("%TF %TT", now, now );
	
		return nowDate;
	}
/*	
	public static void main(String[] args) {
		
		String date = MyDate.printNow();
		System.out.println(date);
	}
	*/
}
