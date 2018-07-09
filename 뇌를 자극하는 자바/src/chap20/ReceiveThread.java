package chap20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiveThread extends Thread {

	Socket socket;
	ReceiveThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			BufferedReader reader = 
			new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				String str = reader.readLine();
				if(str == null)
					break;
				//System.out.println("¼ö½Å>" + str);
				System.out.println(str);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				socket.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
