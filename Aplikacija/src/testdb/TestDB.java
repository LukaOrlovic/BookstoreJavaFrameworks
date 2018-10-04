package testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDB
 */
@WebServlet("/TestDB")
public class TestDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = "root";
		String pass = "root";
		
		String url = "jdbc:mysql://localhost:3306/1baza";
		
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			PrintWriter out = response.getWriter();
			
			out.println("Connecting to: "+url);
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, user, pass);
			
			out.println("Success!!!");
			
			conn.close();
		}
		catch(Exception ex){
			ex.printStackTrace();
			throw new ServletException(ex);
		}
		
	}

}
