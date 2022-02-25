
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my_db.db;
@WebServlet("/up")
public class upd extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i=Integer.parseInt(request.getParameter("h1"));
		String p=request.getParameter("h2");
		String q=request.getParameter("h3");
		String r=request.getParameter("h4");
		String s=request.getParameter("h5");
		String t=request.getParameter("h6");
		String u=request.getParameter("h7");
		PrintWriter out=response.getWriter();
		db k=new db();
		k.j(i, p, q, r, s, t, u);
		response.sendRedirect("admin.jsp");
	}

}
