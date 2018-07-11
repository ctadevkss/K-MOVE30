import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BBSPostServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, 
			              HttpServletResponse response) 
			            		  throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		request.setCharacterEncoding("utf-8");
		
		String name    = request.getParameter("NAME");
		String title   = request.getParameter("TITLE");
		String content = request.getParameter("CONTENT");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<HTML><HEAD><TITLE>게시판 글쓰기 - 결과화면</TITLE></HEAD>");
		out.println("<BODY>");
		out.printf("이름: %s  <br>", name);
		out.printf("제목: %s  <br>", title);
		out.printf("--------------------- <br>");
		out.printf("<pre>%s</pre>", content);
		out.printf("--------------------- <br>");
		out.printf("저장되었습니다.");
		out.println("</BODY>");
		out.println("</HTML>");
		
	}

	
}
