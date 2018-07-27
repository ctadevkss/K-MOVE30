package chap08;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonalInfoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {

		
		PersonalInfo obj; 
		obj = new PersonalInfo(); 
		obj.setAge(24);
		obj.setGender('남');
		obj.setName("이정호");
		
		request.setAttribute("pinfo", obj);
		RequestDispatcher dispatcher = request.getRequestDispatcher("chap08/CustomerInfoViewer.jsp");
		dispatcher.forward(request, response);
	}
	
}
