package chap19;

public class MainProcess {

	LoginView loginView;
	TestFrm testFrm;
	
	public MainProcess() {
		System.out.println("MainProcess() ������");
	}
	
	 // �׽�Ʈ������â
    public void showFrameTest(){
    	System.out.println("MainProcess.showFrameTest();");
    	
        loginView.dispose();   // �α���â�ݱ�
        new WindowExample8_2();
    }	
	
	public static void main(String[] args) {

		System.out.println("MainProcess.main() �޼ҵ�");
		// ����Ŭ���� ����
        MainProcess main = new MainProcess();
        main.loginView = new LoginView(); // �α���â ���̱�
        main.loginView.setMain(main); // �α���â���� ���� Ŭ����������

	}
}
