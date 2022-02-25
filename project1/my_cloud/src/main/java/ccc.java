
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my_db.db;
@WebServlet("/create")
public class ccc extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int d=Integer.parseInt(request.getParameter("a"));
		String a=request.getParameter("b");
		String b=request.getParameter("c");
		String c=request.getParameter("d");
		String s=request.getParameter("e");
		String e=request.getParameter("f");
		String f=request.getParameter("g");
		db o=new db();
		o.f(d, a, b, c, s, e, f);
	}

}
