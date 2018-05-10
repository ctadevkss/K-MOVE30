import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;


/**
 * 2018. 5. 10. Dev By Kim.S.S
   
   PrintfExample1.java
 */

/**
 * @author Administrator
 *
 */
public class PrintfExample1 {
	
    public static void main(String args[]) {
        System.out.printf("%+d%n", 10);
        System.out.printf("%+d%n", -10);
        System.out.printf("가격:%,d원%n", 10000000);  // 천단위 콤마 서식
        
        Calendar now = new GregorianCalendar();
        
        System.out.printf("%1$tY/%1$tm/%1$td %1$tH:%1$tM:%1$tS %n", now);
        System.out.printf("%1$tY년%1$tm월%1$td일 %1$tp %1$tH시%1$tM분%1$tS초 %n", now);
        System.out.printf(Locale.US, "%tc %n", now);
     }
}
