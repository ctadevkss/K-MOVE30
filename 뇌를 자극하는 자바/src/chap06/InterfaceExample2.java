package chap06;

public class InterfaceExample2 {

	public static void main(String[] args) {
		
		Landable[] arr = new Landable[3];
		
		arr[0] = new SeparateVolume("883326ㅍ2", "푸코의 진자", "에코");
		arr[1] = new SeparateVolume("609.2428", "서양미술사", "곰브리치");
        arr[2] = new AppCDInfo("2002-1742", "XML");
       
        
        System.out.println(arr);
        checkOutAll(arr, "윤진혜", "20060315");
	}
	
	static void checkOutAll(Landable[] arr,  String borrower, String date) {
		
		for(int cnt=0; cnt<arr.length; cnt++) {
			try {
				arr[cnt].checkOut(borrower, date);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
