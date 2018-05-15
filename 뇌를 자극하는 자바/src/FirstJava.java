/**
 * 2018. 4. 30. Dev By Kim.S.S
   
   FirstJava.java
 */

import java.lang.*;

public class FirstJava {

	public static void main(String[] args) {
		
		int number1 = 30, number2 = 120;
		int total = plus(number1, number2);
		System.out.println("total:" + total);
		
	}
	
	static int plus(int a, int b)
	{
		return a + b;
	}

}
