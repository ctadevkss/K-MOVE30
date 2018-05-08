public class Person {

	String name;
	int age;
	
	// �Ű����� ���� ������
	public Person() {
	}
	
	// �Ű����� 1���ִ� ������
	public Person(String name) {
		this.name = name;
	}
	
	// �Ű����� 2��(String, int)�ִ� ������
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(String name, int age) �Ű����� 2���ִ� ������ ȣ��");
	}
	
	// �Ű����� 2��(int, String)�ִ� ������
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("Person(int age, String name) �Ű����� 2���ִ� ������ ȣ��");
	}
	
	public void showPerson() {
		System.out.println("�̸�:" + name + "����:" + age);
	}
	
	public void showPerson(Person obj) {
		System.out.println("showPerson(Person obj) �޼ҵ� ȣ��");
		System.out.println("�̸��� : " +  obj.name);
		System.out.println("���̴� : " +  obj.age + "�Դϴ�.");
		
		obj.name = "��ö��";
		obj.age = 10;
	}
		
}
