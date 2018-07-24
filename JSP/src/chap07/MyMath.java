package chap07;

public class MyMath {

	public static int sum(int start, int end) {
		
		int sum = 0;
		
		for(int cnt= start; cnt<=end; cnt++)
			sum += cnt;
		
		return sum;
	}
}
