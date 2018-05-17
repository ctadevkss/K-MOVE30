package chap06;

public class InheritanceExample7 {

	   public static void main(String args[]) {
	        Account obj1 = new Account("111-22-333333", "ÀÓ²©Á¤", 10000);  
	        CheckingAccount obj2 = new CheckingAccount(
	            "444-55-666666", "È«±æµ¿", 20000, "5555-6666-7777-8888");
	        CreditLineAccount obj3 = new CreditLineAccount(
	            "777-88-999999", "±è¼±´Þ", 30000, 20000000);
	        BonusPointAccount obj4 = new BonusPointAccount(
	            "000-00-000000", "±è¹Ì¿µ", 0, 0);
	        printAccountInfo(obj1);
	        printAccountInfo(obj2);
	        printAccountInfo(obj3);
	        printAccountInfo(obj4);
	    }
	    static void printAccountInfo(Account obj) {
	        System.out.println("°èÁÂ¹øÈ£:" + obj.accountNo);
	        System.out.println("¿¹±ÝÁÖ ÀÌ¸§:" + obj.ownerName);
	        System.out.println("ÀÜ¾×:" + obj.balance);
	        System.out.println();
	    }
}
