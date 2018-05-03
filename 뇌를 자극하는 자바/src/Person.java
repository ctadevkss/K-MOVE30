public class Person {

	String name;
	int age;
	
	// 매개변수 없는 생성자
	public Person() {
	}
	
	// 매개변수 1개있는 생성자
	public Person(String name) {
		this.name = name;
	}
	
	// 매개변수 2개있는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println("이름:" + name + "나이:" + age);
	}

}
