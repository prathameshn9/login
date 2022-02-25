
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my_db.db;

@WebServlet("/do")
public class forg extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		long i = Long.parseLong(request.getParameter("d1"));
		db s = new db();
		if(s.check(i)) {
			RequestDispatcher rd=request.getRequestDispatcher("fo.jsp"); 
			request.setAttribute("name", i);
			rd.forward(request, response);
		}
	}
}
