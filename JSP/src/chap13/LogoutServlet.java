package chap13;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.removeAttribute("LOGIN_ID");
		session.invalidate();
		response.sendRedirect("chap13/WebTemplate.jsp?BODY_PATH=LogoutResult.jsp?LOGOUT_RESULT=SUCCESS");
		
	}

	
}
