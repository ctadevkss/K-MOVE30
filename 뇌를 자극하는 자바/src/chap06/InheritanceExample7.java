package chap06;

public class InheritanceExample7 {

	   public static void main(String args[]) {
	        Account obj1 = new Account("111-22-333333", "�Ӳ���", 10000);  
	        CheckingAccount obj2 = new CheckingAccount(
	            "444-55-666666", "ȫ�浿", 20000, "5555-6666-7777-8888");
	        CreditLineAccount obj3 = new CreditLineAccount(
	            "777-88-999999", "�輱��", 30000, 20000000);
	        BonusPointAccount obj4 = new BonusPointAccount(
	            "000-00-000000", "��̿�", 0, 0);
	        printAccountInfo(obj1);
	        printAccountInfo(obj2);
	        printAccountInfo(obj3);
	        printAccountInfo(obj4);
	    }
	    static void printAccountInfo(Account obj) {
	        System.out.println("���¹�ȣ:" + obj.accountNo);
	        System.out.println("������ �̸�:" + obj.ownerName);
	        System.out.println("�ܾ�:" + obj.balance);
	        System.out.println();
	    }
}
