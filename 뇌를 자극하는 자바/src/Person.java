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
	
	// �Ű����� 2���ִ� ������
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println("�̸�:" + name + "����:" + age);
	}

}
