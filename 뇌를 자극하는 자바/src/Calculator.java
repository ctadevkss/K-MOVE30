import java.util.Scanner;

/**
 * 2018. 5. 1. Dev By Kim.S.S
   
   Calculator.java
 */

/**
 * @author Administrator
 *
 */
public class Calculator {
	// �Ӽ��ʵ�(������)
	// int number1 = 0;
	// int number2 = 0;
	
	// �޼ҵ�(�Լ� ���)
	public int plus(int x, int y, int z)
	{
		int total = x + y + z; // total = num1 + num2 + num3;
		return total;
	}
	
	public static void main(String[] args) {
		
		int num1 , num2, num3;
		
		System.out.println("���� ���� �Է�");
		Scanner scan= new Scanner(System.in); // scanf("%d", &num1);  c��� ��Ÿ��
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
				
		// ��ü���� 
		Calculator cal = new Calculator();
		int result = cal.plus(num1, num2, num3);
		System.out.println("result:" + result);
	}
}
