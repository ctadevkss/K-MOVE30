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
		this.radius = 1;
		this.name = "";
		//name = "";  
	}

	// 매개변수를 가진 생성자
	public Circle(int radius, String name) {
		this.radius = radius;
		name = name;
	}

	// 메소드
	public double getArea() {
		return 3.14 * radius * radius;
	}

	// 메인메소드
	public static void main(String[] args) {
		
		Circle pizza = new Circle(10, "자바피자");
		double pizza_area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + pizza_area);
/*		
		Circle donut = new Circle(); // 매개변수 없는 생성자 호출
		donut.radius = 2;
		donut.name = "자바도넛";
		
		double donut_area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + donut_area);
		System.out.println(pizza.name + "의 면적은 " + pizza_area);	
*/
	}

}
