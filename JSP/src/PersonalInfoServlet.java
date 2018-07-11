import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonalInfoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("NAME");
		String id = request.getParameter("ID");
		String password = request.getParameter("PASSWORD");
		String gender = request.getParameter("GENDER");
		
		if(gender.equals("MALE"))
			gender = "남";
		else
			gender = "여";
	
		String iNotice = request.getParameter("INOTICE");
		String clNotice = request.getParameter("CNOTICE");
		String dNotice = request.getParameter("DNOTICE");
		
		String job = request.getParameter("JOB");
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("<HTML><HEAD></HEAD>");
		out.println("<BODY>");
		out.println("<h2>개인정보 입력</h2>");
		out.printf("이름:  %s <br/>", name);
		out.printf("아이디:  %s <br/>", id);
		out.printf("암호:  %s <br/>", password);
		out.printf("성별:  %s <br/>", gender);
		out.printf("공지메일:  %s <br/>", noticeToHangul(iNotice));
		out.printf("광고메일:  %s <br/>", noticeToHangul(clNotice));
		out.printf("배송확인메일:  %s <br/>", noticeToHangul(dNotice));
		out.printf("직업:  %s <br/>", job);
		out.println("</BODY>");
		out.println("</HTML>");
				
		// TODO Auto-generated method stub
		//super.doGet(request, response);
	}
	
	private String noticeToHangul(String notice) {
		if(notice == null)
			return "받지않음";
		else if(notice.equals("on"))
			return "받음";
		else
			return notice;
	}	
}
