package chap08;

import java.util.*;
public class DateTime {

	public static void main(String[] args) {
		
		GregorianCalendar obj = new GregorianCalendar();
		int year = obj.get(GregorianCalendar.YEAR);
		int month = obj.get(GregorianCalendar.MONTH) + 1;
		int day = obj.get(GregorianCalendar.DATE);
		System.out.println("������ " + year + "��" + month + "��" + day + "�� �Դϴ�.");

	}

}
