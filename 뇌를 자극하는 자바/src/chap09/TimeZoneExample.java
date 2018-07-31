/**
 * 2018. 5. 14. Dev By Kim.S.S
   chap09
   TimeZoneExample.java
 */
package chap09;

import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class TimeZoneExample {

	public static void main(String[] args) {
		String[] ids = TimeZone.getAvailableIDs();
		for (String id : ids) {
			System.out.println(displayTimeZone(TimeZone.getTimeZone(id)));
		}
		System.out.println("\nTotal TimeZone ID " + ids.length);
	}
	
	private static String displayTimeZone(TimeZone tz) {
		long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
		long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset()) - TimeUnit.HOURS.toMinutes(hours);
		minutes = Math.abs(minutes);
		String result = "";
		if (hours > 0) {
			result = String.format("(GMT+%d:%02d) %s", hours, minutes, tz.getID());
		} else {
			result = String.format("(GMT%d:%02d) %s", hours, minutes, tz.getID());
		}
		return result;
	}
}
