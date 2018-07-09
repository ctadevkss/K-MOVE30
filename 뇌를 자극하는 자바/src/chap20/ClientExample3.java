package chap20;

import java.net.Socket;

public class ClientExample3 {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket("192.168.0.22", 9001);
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiveThread(socket);
			
			thread1.start();
			thread2.start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
