

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my_db.db;
@WebServlet("/po")
public class cd extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		long i=Long.parseLong(request.getParameter("q"));
		String d=request.getParameter("q1");
		String f=request.getParameter("q2");
		PrintWriter out=response.getWriter();
		db x=new db();
		if(d.equals(f)) {
			x.chck(i, f);
			out.println("Updated");
		}
		else {
			out.println("Not Updated");
		}
		
		
	}

	

}
