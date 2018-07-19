package chap06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet {
	
	private PrintWriter logFile;

	@Override
	public void init() throws ServletException {
		
		try {
			logFile = new PrintWriter(new FileWriter("C:\\data\\log.txt", true));
		}
		catch (Exception e) {
			throw new ServletException(e);
		}
	}


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("NAME");
		String greeting = "안녕하세요, " + name + "님.";
		
		if(logFile!=null) {
			GregorianCalendar now = new GregorianCalendar();
			logFile.printf("%TF %TT - %s %n", now, now, name);
		}
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("<HTML><HEAD></HEAD>");
		out.println("<BODY>");
		out.printf(greeting);
		out.println("</BODY>");
		out.println("</HTML>");
		
	}

	@Override
	public void destroy() {
		
		if(logFile!=null)
			logFile.close();	
	}

}
