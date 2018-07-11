import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdderServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, 
			             HttpServletResponse response) 
			              throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		
		String str1 = request.getParameter("NUM1");
		String str2 = request.getParameter("NUM2");
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int sum = num1 + num2;
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<HTML><HEAD></HEAD>");
		out.println("<BODY>덧셈프로그램");
		out.printf("%d + %d = %d",  num1, num2, sum);
		out.println("</BODY>");
		out.println("</HTML>");
		
	}

	
}
