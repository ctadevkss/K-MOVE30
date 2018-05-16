package chap06;

// �ڽ�Ŭ���� 

class CreditLineAccount extends Account {
	int creditLine;
	
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
		System.out.println("CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) ������" );
	}
	
	public int displayCreditLine() {
		return creditLine;
	}
	
	int withdraw(int amount) throws Exception {
		if( (balance + creditLine) < amount)
			throw new Exception("���̳ʽ� �ѵ����� ���� �մϴ�.");
		
		balance -= amount;
		return amount;
	}
}

public class InheritanceExample3 {

	public static void main(String[] args) {
		
		CreditLineAccount obj = new CreditLineAccount("000-11-111111", "�輱��", 10000, 20000000);
		
		try {
			int balance =  obj.displayBalance();
			System.out.println("�ܾ�:" + balance);
			
			int amount = obj.withdraw(50000);
			System.out.println("�����:" + amount);
			
			balance = obj.displayBalance();
			System.out.println("�ܾ�:" + balance);
			
			int creditLine = obj.displayCreditLine();
			System.out.println("�ѵ��ݾ�:" + creditLine);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	

	}

}
