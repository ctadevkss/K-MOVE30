package chap06;

// 슈퍼클래스 , 부모클래스
abstract class Person{
	int money;
	
	public Person() {
		// 기본생성자
		System.out.println("부모클래스에 기본생성자 Person() 호출");
		this.money =  300000000; 
	}
	
	public Person(int money) {
		this.money = money;
		System.out.println("부모클래스에 Person(int money)생성자  호출");
	}
	
	abstract void displayHello();
	
	public void displayMoeny() {
		System.out.println("재산:" + money);
		
	}
}

// 서브클래스, 자식클래스
class Child extends Person{
	
	public Child() {
		System.out.println("자식클래스에 기본생성자 Child() 호출");
		super.displayMoeny(); // 부모클래스에 메소드 호출
	}

	@Override
	void displayHello() {
		
		System.out.println("안녕하세요.");
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
		//System.out.println("재산:" + person.money);
		
		
		
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
