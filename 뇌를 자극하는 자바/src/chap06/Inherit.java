package chap06;

// ����Ŭ���� , �θ�Ŭ����
abstract class Person{
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
	
	abstract void displayHello();
	
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

	@Override
	void displayHello() {
		
		System.out.println("�ȳ��ϼ���.");
	}
	
	
}

class USAChild extends Person {

	@Override
	void displayHello() {
		System.out.println("Hi~~~~~~~~~~~~~~~~~~");
	}
		
	
}



public class Inherit {

	public static void main(String[] args) {
		
		
		
		//Person person = new Person(1000000000);
		//System.out.println("���:" + person.money);
		
		
		
		Person person = new Child();
		person.displayHello();
		
		person = new USAChild();
		person.displayHello();
		
		
		
		
		//child.displayHello();
		
		//Person person = new Child();
		
		
		//child.displayMoeny();
		//System.out.println(child.money);
		

	}

}
