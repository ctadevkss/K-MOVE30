package chap06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InterfaceExample3 {

	public static void main(String[] args) {
		
		SeparateVolume obj = new SeparateVolume("863?774��", "����", "��������"); // ��ü������ ����ʵ�(����) ���� ����
		
		Date date = new Date();
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy�� MM�� dd��");
		String strDate = sf.format(date);
		
		//System.out.println(strDate);
		
		try {
			obj.checkOut("ȫ�浿", strDate);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		printState(obj);
		
		obj.checkIn();
		
		printState(obj);

	}
	
	static void printState(SeparateVolume obj) {
		if(obj.state == Landable.STAT_NORMAL) {
			System.out.println("====================");
			System.out.println("�������: ���Ⱑ��");
			System.out.println("====================");
		}
		
		else {
			System.out.println("====================");
			System.out.println("�������: ������");
			System.out.println("������: " + obj.borrower);
			System.out.println("������: " + obj.checkOutDate);
			System.out.println("====================");			
		}
	}

}
