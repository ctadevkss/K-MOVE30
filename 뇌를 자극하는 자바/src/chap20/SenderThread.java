package chap20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread {

	Socket socket;
	String name;
	
	SenderThread(Socket socket) {
		this.socket = socket;
	}
	
	SenderThread(Socket socket, String name) {
		this.socket = socket;
		this.name = name;
	}
		
	public void run() {
		try {
			BufferedReader reader =
			new BufferedReader(new InputStreamReader(System.in));
			
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			// 이름출력
			writer.println(name);
			writer.flush();
			
			
			while(true) {
				String str = reader.readLine();
				if(str.equals("bye"))
					break;
				writer.println(str);
				writer.flush();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
