package chap06;

// ����Ŭ���� , �θ�Ŭ����
class Person{
	int money;
	
	public Person() {
		// �⺻������
		System.out.println("�θ�Ŭ������ �⺻������ Person() ȣ��");
		this.money =  300000000; 
	}
	
	public Person(int money) {
		this.money = money;
		System.out.println("�θ�Ŭ������ Person(int money)������  ȣ��");
	}
	
	public void displayMoeny() {
		System.out.println("���:" + money);
		
	}
}

// ����Ŭ����, �ڽ�Ŭ����
class Child extends Person{
	
	public Child() {
		System.out.println("�ڽ�Ŭ������ �⺻������ Child() ȣ��");
		super.displayMoeny(); // �θ�Ŭ������ �޼ҵ� ȣ��
	}
}

public class Inherit {

	public static void main(String[] args) {
		
		//Person person = new Person(1000000000);
		//System.out.println("���:" + person.money);
		
		Child child = new Child();
		
		//child.displayMoeny();
		//System.out.println(child.money);
		

	}

}
