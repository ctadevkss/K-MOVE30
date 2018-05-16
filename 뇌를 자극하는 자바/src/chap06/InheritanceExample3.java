package chap06;

// 자식클래스 

class CreditLineAccount extends Account {
	int creditLine;
	
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
		System.out.println("CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) 생성자" );
	}
	
	public int displayCreditLine() {
		return creditLine;
	}
	
	int withdraw(int amount) throws Exception {
		if( (balance + creditLine) < amount)
			throw new Exception("마이너스 한도액이 부족 합니다.");
		
		balance -= amount;
		return amount;
	}
}

public class InheritanceExample3 {

	public static void main(String[] args) {
		
		CreditLineAccount obj = new CreditLineAccount("000-11-111111", "김선달", 10000, 20000000);
		
		try {
			int balance =  obj.displayBalance();
			System.out.println("잔액:" + balance);
			
			int amount = obj.withdraw(50000);
			System.out.println("인출액:" + amount);
			
			balance = obj.displayBalance();
			System.out.println("잔액:" + balance);
			
			int creditLine = obj.displayCreditLine();
			System.out.println("한도금액:" + creditLine);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	

	}

}
