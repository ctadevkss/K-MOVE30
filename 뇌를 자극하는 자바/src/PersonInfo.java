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
		Person person;
		
		// �Ű����� ���� ����Ʈ ������ ȣ���Ͽ� ��ü����
		// person = new Person();

		// String �Ű����� 1���ִ� ������ ȣ���Ͽ� ��ü����
		//person = new Person("ȫ�浿");
		
		// String �Ű����� int �Ű����� �ִ� ������ ȣ���Ͽ� ��ü����
		person = new Person("ȫ�浿", 20);
		person.showPerson();
		
	}

}
