/**
 * 2018. 5. 15. Dev By Kim.S.S
   chap09
   After100Days.java
 */
package chap09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class After100Days {

	/**
	 * 오늘부터 100일후의 날짜.
	 */
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();	
		calendar.setTime(new Date()); // 현재시간 설정
		calendar.add(Calendar.DATE, 100);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		String date = dateFormat.format(calendar.getTime());
		
		System.out.println(date);

/*		
		GregorianCalendar gcalendar = new GregorianCalendar();
		gcalendar.add(gcalendar.DATE, 5);
		System.out.println(gcalendar.getTime());
*/

	}

}
