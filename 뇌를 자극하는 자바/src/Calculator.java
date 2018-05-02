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
	// 속성필드(데이터)
	// int number1 = 0;
	// int number2 = 0;
	
	// 메소드(함수 기능)
	public int plus(int x, int y, int z)
	{
		int total = x + y + z; // total = num1 + num2 + num3;
		return total;
	}
	
	public static void main(String[] args) {
		
		int num1 , num2, num3;
		
		System.out.println("세개 숫자 입력");
		Scanner scan= new Scanner(System.in); // scanf("%d", &num1);  c언어 스타일
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
				
		// 객체생성 
		Calculator cal = new Calculator();
		int result = cal.plus(num1, num2, num3);
		System.out.println("result:" + result);
	}
}
