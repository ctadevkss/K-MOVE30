package chap06;

public class InterfaceExample1 {

	public static void main(String[] args) {
	
		//SeparateVolume obj1 = new SeparateVolume("863?774��", "����", "��������"); // ��ü������ ����ʵ�(����) ���� ����
		
		//Landable obj1 = new SeparateVolume("863?774��", "����", "��������"); // ��ü������ ����ʵ�(����) ���� ����
		
		Landable obj = new SeparateVolume("863?774��", "����", "��������"); // ��ü������ ����ʵ�(����) ���� ����
		
		//AppCDInfo obj2 = new AppCDInfo("2005-7001","Redhat Fedora");
		
		// Landable obj2 = new AppCDInfo("2005-7001","Redhat Fedora");
		try {
			obj.checkOut("�迵��",  "20060315");
		//obj2.checkOut("�����", "20060317");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		obj.checkIn();
		//obj2.checkIn();
		
		obj = new AppCDInfo("2005-7001","Redhat Fedora");
		try {
			obj.checkOut("�����", "20060317");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		obj.checkIn();
		

	}

}
