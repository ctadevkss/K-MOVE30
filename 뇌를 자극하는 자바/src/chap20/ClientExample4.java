package chap20;

import java.net.Socket;

public class ClientExample4 {

	public static void main(String[] args) {
		
		if(args.length !=1) {
			System.out.println("이름을 입력하세요.");
			return;
		}
		try {
			Socket socket = new Socket("192.168.0.22", 9002);
			Thread thread1 = new SenderThread(socket, args[0]);
			Thread thread2 = new ReceiveThread(socket);
			
			thread1.start();
			thread2.start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
