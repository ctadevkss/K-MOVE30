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
		
	// �Ű����� ���� ������
	public Circle() { 
		radius = 1;
		name = "";  
	}

	// �Ű������� ���� ������
	public Circle(int r, String n) {
		radius = r;
		name = n;
	}

	// �޼ҵ�
	public double getArea() {
		return 3.14 * radius * radius;
	}

	// ���θ޼ҵ�
	public static void main(String[] args) {
		
		Circle pizza = new Circle(10, "�ڹ�����");
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
	}

}
