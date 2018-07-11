import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PibonachiServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		int a = 1, b = 1 , c = 0;
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("<HTML><HEAD></HEAD>");
		out.println("<BODY>");
		
		out.printf("%d ", a);
		out.printf("%d ", b);
		
		while(true) {
			c = a + b;
			a = b;
			b = c;
		
			if(c < 100)
				out.printf("%d ", c); //System.out.print(c + "  ");
			else
				break;
		}
		
		out.println("</BODY>");
		out.println("</HTML>");
	}
	
}
