package chap19;

public class MainProcess {

	LoginView loginView;
	TestFrm testFrm;
	
	public MainProcess() {
		System.out.println("MainProcess() 생성자");
	}
	
	 // 테스트프레임창
    public void showFrameTest(){
    	System.out.println("MainProcess.showFrameTest();");
    	
        loginView.dispose();   // 로그인창닫기
        new WindowExample8_2();
    }	
	
	public static void main(String[] args) {

		System.out.println("MainProcess.main() 메소드");
		// 메인클래스 실행
        MainProcess main = new MainProcess();
        main.loginView = new LoginView(); // 로그인창 보이기
        main.loginView.setMain(main); // 로그인창에게 메인 클래스보내기

	}
}
