import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ResultServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String food   = (String)session.getAttribute("FOOD");
		String animal = request.getParameter("ANIMAL");
		session.invalidate();
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("<HTML><HEAD></HEAD>");
		out.println("<BODY>");
		out.println("<h2>성격 테스트</h2>");
		out.printf("당신은 %s 와 %s를 좋아하는 성격입니다.", food, animal);
		out.println("</BODY>");
		out.println("</HTML>");
		
	}

	
}
