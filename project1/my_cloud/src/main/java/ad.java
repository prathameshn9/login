
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my_db.db;

@WebServlet("/adm")
public class ad extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String p = request.getParameter("dept");
		PrintWriter out = response.getWriter();
		db q=new db();
		RequestDispatcher rd=request.getRequestDispatcher("stdlist.jsp");
		request.setAttribute("name", q.s(p));
		rd.forward(request, response);
	}
}
