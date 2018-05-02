/**
 * 2018. 5. 2. Dev By Kim.S.S
   
   Circle.java
 */

/**
 * @author Administrator
 *
 */
public class Circle {
	public int radius;
	public String name;
		
	// 매개변수 없는 생성자
	public Circle() { 
		radius = 1;
		name = "";  
	}

	// 매개변수를 가진 생성자
	public Circle(int r, String n) {
		radius = r;
		name = n;
	}

	// 메소드
	public double getArea() {
		return 3.14 * radius * radius;
	}

	// 메인메소드
	public static void main(String[] args) {
		
		Circle pizza = new Circle(10, "자바피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
	}

}
