/**
 * 2018. 5. 3. Dev By Kim.S.S
   
   PersonInfo.java
 */

/**
 * @author Administrator
 *
 */
public class PersonInfo {

	public static void main(String[] args) {
		
		// Ŭ���� ���� 
		Person obj;
		
		// �Ű����� ���� ����Ʈ ������ ȣ���Ͽ� ��ü����
		//person = new Person();

		// String �Ű����� 1���ִ� ������ ȣ���Ͽ� ��ü����
		//person = new Person("ȫ�浿");
		
		// String �Ű����� int �Ű����� �ִ� ������ ȣ���Ͽ� ��ü����
		//person = new Person("ȫ�浿", 20);
		
		// int �Ű����� �ְ� String �Ű����� �ִ� ������ ȣ���Ͽ� ��ü����
		obj = new Person(20, "ȫ�浿");
		
		// �޼ҵ� ȣ��
		obj.showPerson(obj);
		obj.showPerson();
		
		//System.out.println(obj);
		
	}

}
