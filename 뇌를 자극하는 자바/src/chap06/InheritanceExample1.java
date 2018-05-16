package chap06;

class Account {
    String accountNo;
    String ownerName;
    int balance;
    
    public Account() {
    	System.out.println("Account() �⺻������");
    }
    
    public Account(String accountNo, String ownerName, int balance) {
    	this.accountNo = accountNo;
    	this.ownerName = ownerName;
    	this.balance = balance;
    	System.out.println("Account(String accountNo, String ownerName, int balance)");
    }
    
    public int displayBalance() {
    	return balance;
    }
    
    void deposit(int amount) {
        balance += amount;
    }
    
    int withdraw(int amount) throws Exception {
        if (balance < amount)
            throw new Exception("�ܾ��� �����մϴ�.");
        balance -= amount;
        return amount;
    }
}

class CheckingAccount  extends Account  {
    String cardNo;
    
//    public CheckingAccount() {
//    	System.out.println("CheckingAccount() �⺻������ ȣ��");
//    }
//    
    public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
    	// �θ�Ŭ������  public Account(String accountNo, String ownerName, int balance) ȣ��
    	super(accountNo, ownerName, balance); 
    	this.cardNo = cardNo;
    	
    	System.out.println("CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) ������");
    }
    
    int pay(String cardNo, int amount)  throws Exception{  
        if (!cardNo.equals(this.cardNo)) 
            throw new Exception("���¹�ȣ�� Ʋ���ϴ�.");
        if(balance < amount)
        	throw new Exception("pay(String cardNo, int amount) �ܾ��� �����մϴ�.");
        return withdraw(amount);
    }
}

public class InheritanceExample1 {

	public static void main(String[] args) {
		
		CheckingAccount obj = new CheckingAccount("111-22-33333333", "ȫ�浿", 0, "5555-6666-7777-8888"); 
		
//        CheckingAccount obj = new CheckingAccount(); // �⺻������         
//        obj.accountNo = "111-22-33333333";    
//        obj.ownerName = "ȫ�浿";           
//        obj.cardNo = "5555-6666-7777-8888";
//        
        obj.deposit(100000); // �Ա�
        
        try {
            int paidAmount = obj.pay("5555-6666-7777-8888", 47000); // ���   
            
            System.out.println("���Ҿ�:" + paidAmount);
            System.out.println("�ܾ�:" + obj.balance);
        }
        catch (Exception e) {

            String msg = e.getMessage();
            System.out.println("���ܸ޼���:" + msg);
        }

	}

}
