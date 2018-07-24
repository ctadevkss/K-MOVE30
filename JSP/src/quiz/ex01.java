package quiz;

public class ex01 {

	public static void main(String[] args) {

		int inputAry[] = { 1, 5, 4, 8, 315};
		int outputAry[] = new int[inputAry.length];
		int i=0, cnt = 0;
		
		for(i=0; i<inputAry.length; i++) {
			//System.out.println(inputAry[i]);
			if( inputAry[i] %2 == 0 ) {
				outputAry[cnt] = inputAry[i];
				cnt++;
			}
		}
		
		for(i=0; i<cnt; i++) {
			System.out.print(outputAry[i] + " ");
		}

	}

}
