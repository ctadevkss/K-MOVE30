package chap20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class PerClientThread extends Thread {

	static List<PrintWriter> list =
			java.util.Collections.synchronizedList(new ArrayList<>());
	
	Socket socket;
	PrintWriter writer;
	
	PerClientThread(Socket socket) {
		this.socket = socket;
		
		try {
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		
		String name = null;
		try {
			BufferedReader reader = 
			new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			name = reader.readLine();
			sendAll("#" + name + "´ÔÀÌ µé¾î¿À¼Ì½À´Ï´Ù.");
			while(true) {
				String str = reader.readLine();
				if(str == null)
					break;
				sendAll(name + ">" + str);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			list.remove(writer);
			sendAll("#" + name + " ´ÔÀÌ ³ª°¡¼Ì½À´Ï´Ù.");
			try {
				socket.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private void sendAll(String str) {
		for(PrintWriter writer : list) {
			writer.println(str);
			writer.flush();
		}
	}
	
}
