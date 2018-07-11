
public class Pibonachi {

	public static void main(String[] args) {
		
		System.out.println("Pibonachi Print");
		
		int a = 1, b = 1 , c = 0;
		
		System.out.print(a + "  ");
		System.out.print(b + "  ");
		
		while(true) {
			c = a + b;
			a = b;
			b = c;
		
			if(c < 100)
				System.out.print(c + "  ");
			else
				break;
		}

	}

}
