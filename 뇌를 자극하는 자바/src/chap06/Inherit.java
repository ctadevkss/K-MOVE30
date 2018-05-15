package chap06;

// 슈퍼클래스 , 부모클래스
class Person{
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
}

public class Inherit {

	public static void main(String[] args) {
		
		//Person person = new Person(1000000000);
		//System.out.println("재산:" + person.money);
		
		Child child = new Child();
		
		//child.displayMoeny();
		//System.out.println(child.money);
		

	}

}
