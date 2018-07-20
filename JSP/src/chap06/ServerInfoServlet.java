package chap06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServerInfoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, 
			             HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		String serverInfo      = context.getServerInfo();
		int majorVersion       = context.getMajorVersion();
		int minorVersion       = context.getMinorVersion();
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("<HTML><HEAD></HEAD>");
		out.println("<BODY>");
		out.printf("웹 서버의 종류:%s <br/>" , serverInfo);
		out.printf("지원하는 서블릿 버전:%d.%d <br/>" , 
								majorVersion, minorVersion);
		out.println("</BODY>");
		out.println("</HTML>");
	}

	
}
