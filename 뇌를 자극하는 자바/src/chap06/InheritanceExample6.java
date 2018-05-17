/**
 * 2018. 5. 17. Dev By Kim.S.S
   chap06
   InheritanceExample6.java
 */

package chap06;

abstract class MessageSender {

	String title;
	String senderName;
			
	public MessageSender(String title, String sendName) {
		this.title = title;
		this.senderName = sendName;
	}

	abstract void sendMessage(String recipient);
}


class EmailSender extends MessageSender {
	
	String sendAddr;
	String emailBody;
	
	public EmailSender(String title, String senderName, String sendAddr, String emailBody) {
		super(title, senderName);
		this.sendAddr = sendAddr;
		this.emailBody = emailBody;
	}

	@Override
	void sendMessage(String recipient) {
		
		System.out.println("-----------------------------");
		System.out.println("����: " + title);
		System.out.println("������ ���: " + senderName + 
							" " + sendAddr);
		System.out.println("�޴� ���: " + recipient);
		System.out.println("����: " + emailBody);
		
	}
		
}

class SMSSender extends MessageSender {
    String returnPhoneNo;
    String message;
    SMSSender(String title, String senderName, 
              String returnPhoneNo, String message) {
        super(title, senderName);
        this.returnPhoneNo = returnPhoneNo;
        this.message = message;
    }
    void sendMessage(String recipient) {
        System.out.println("------------------------------");
        System.out.println("����: " + title);
        System.out.println("������ ���: " + senderName);
        System.out.println("��ȭ��ȣ: " + recipient);
        System.out.println("ȸ�� ��ȭ��ȣ: " + returnPhoneNo);
        System.out.println("�޽��� ����: " + message);
    }
}


public class InheritanceExample6 {

	public static void main(String[] args) {
		
		EmailSender obj1 = new EmailSender("������ �����մϴ�", "������", "admin@dukeeshop.co.kr", "10% ���������� ����Ǿ����ϴ�.");
		
		SMSSender obj2 = new SMSSender("������ �����մϴ�", "������",
	             "02-000-0000", "10% ���������� ����Ǿ����ϴ�.");
	        obj1.sendMessage("hatman@yeyeye.com");
	        obj1.sendMessage("stickman@hahaha.com");
	        obj2.sendMessage("010-000-0000");
	        
//		MessageSender messageSender = new EmailSender("������ �����մϴ�", "������", "admin@dukeeshop.co.kr", "10% ���������� ����Ǿ����ϴ�.");
//		messageSender.sendMessage("rlatkdtn97@naver.com");
		
	}

}
