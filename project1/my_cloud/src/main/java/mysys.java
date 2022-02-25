
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my_db.db;

@WebServlet("/login")
public class mysys extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Long n = Long.parseLong(request.getParameter("n1"));
		String p = request.getParameter("p1");
		PrintWriter pw = response.getWriter();
		db s = new db();
		if (s.check(n)) {
			if (s.che(p)) {
				response.sendRedirect("admin.jsp");
			} else {
				pw.println("check Password");
			}
		} else {
			response.sendRedirect("sig.jsp");
		}
	}

}