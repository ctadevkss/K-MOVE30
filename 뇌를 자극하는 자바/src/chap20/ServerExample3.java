package chap20;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample3 {
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9001);
			socket = serverSocket.accept();
			
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
				serverSocket.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
