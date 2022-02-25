
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my_db.db;

@WebServlet("/signup")
public class create extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long n =Long.parseLong(request.getParameter("n2"));
		String p=request.getParameter("p2");
		PrintWriter pw=response.getWriter();
		db s=new db();
		if(s.val(n, p)) {
			pw.println("account created");
		}

	}

}
