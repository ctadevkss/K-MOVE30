package chap20;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample4 {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(9002);
			
			while(true) {
				
				Socket socket = serverSocket.accept();
				Thread thread = new PerClientThread(socket);
				thread.start();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
	}

}
