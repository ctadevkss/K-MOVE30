import java.io.IOException;
import java.io.PrintWriter;

import javax.print.attribute.standard.RequestingUserName;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AnimalServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String food = request.getParameter("FOOD");
		
		HttpSession session = request.getSession();
		session.setAttribute("FOOD", food);
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("<HTML><HEAD></HEAD>");
		out.println("<BODY>");
		out.println("<h2>좋아하는 동물은?</h2>");
		out.printf("<form action='/JSP/result'>");
		out.printf("<input type='text' name='ANIMAL'>");
		out.printf("<input type='submit' value='확인'>");
		out.printf("</form>");
		out.println("</BODY>");
		out.println("</HTML>");
	}
}
