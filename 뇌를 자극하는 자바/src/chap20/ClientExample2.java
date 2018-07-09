package chap20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientExample2 {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			socket = new Socket("192.168.0.22", 9000);
			
			BufferedReader reader = 
		    new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			PrintWriter writer =
			new PrintWriter(socket.getOutputStream());
			
			
			writer.println("Hello Server~");
			writer.flush();
			
			String str = reader.readLine();
			System.out.println(str);

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
