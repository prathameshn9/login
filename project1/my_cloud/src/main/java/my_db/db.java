package my_db;

import java.sql.*;

public class db {

	String sql = "select * from login where mobno=? ";
	String spl = "select * from login where password=? ";

	public boolean check(long mobno) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "Appu@2000");

			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setLong(1, mobno);
			ResultSet rs = stmt.executeQuery();

			if (rs.next())
				return true;

		} catch (Exception e) {
			System.out.println(e);
		}
		return false;

	}

	public boolean che(String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "Appu@2000");

			PreparedStatement stmp = con.prepareStatement(spl);
			stmp.setString(1, password);
			ResultSet rp = stmp.executeQuery();
			if (rp.next())
				return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public boolean val(long mobno, String passwd) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "Appu@2000");
			String sql = "insert into login " + " values (?, ?)";
			PreparedStatement myStmt = con.prepareStatement(sql);
			myStmt.setLong(1, mobno);
			myStmt.setString(2, passwd);
			myStmt.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}

		return false;

	}

	public ResultSet s(String p) {
		ResultSet rs = null;
		if (p.equalsIgnoreCase("All")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String query = "Select * from student";
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "Appu@2000");
				PreparedStatement stmt = con.prepareStatement(query);
				return rs = stmt.executeQuery();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String query = "Select * from student where dept=?";
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "Appu@2000");
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, p);
				return rs = stmt.executeQuery();

			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return (ResultSet) rs;
	}

	public String j(int d, String w, String q, String r, String s, String t, String u) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String query = "update student set name=?,mobno=?,dept=?,totalfee=?,feepaid=?,balance=? where rollno=" + d;
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "Appu@2000");
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, w);
			stmt.setString(2, q);
			stmt.setString(3, r);
			stmt.setString(4, s);
			stmt.setString(5, t);
			stmt.setString(6, u);
			int i = stmt.executeUpdate();
			return "Updated";
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	public String j(int f) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String query = "delete from student where rollno=" + f;
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "Appu@2000");
			PreparedStatement stmt = con.prepareStatement(query);
			int i = stmt.executeUpdate();
			return "Deleted";
		} catch (Exception e) {
			System.out.println(e);
		}
		return "Not deleted";
	}

	public String chck(long mobno, String n1) {
		String stl = "update login set password=? where mobno=" + mobno;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "Appu@2000");
			PreparedStatement stmt = con.prepareStatement(stl);
			stmt.setString(1, n1);
			int i = stmt.executeUpdate();
			return "Password Set";
		} catch (Exception e) {
			System.out.println(e);
		}
		return "Password Not Set";
	}

	public String f(int d, String w, String q, String r, String s, String t, String u) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String query = "insert into student set rollno=?, name=?,mobno=?,password=?,dept=?,totalfee=?,feepaid=?,balance=?";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "Appu@2000");
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, d);
			stmt.setString(2, w);
			stmt.setLong(3, Long.parseLong(q));
			stmt.setString(4, "");
			stmt.setString(5, r);
			stmt.setLong(6, Long.parseLong(s));
			stmt.setLong(7, Long.parseLong(t));
			stmt.setLong(8, Long.parseLong(u));
			int i = stmt.executeUpdate();
			return "created";
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

}
