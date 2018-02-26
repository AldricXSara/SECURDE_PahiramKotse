package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// JDBC driver name and database URL
	    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL="jdbc:mysql://localhost/3306";

	    //  Database credentials
	    final String USER = "root";
	    final String PASS = "password";

		
		String uname = request.getParameter("uname");
		String pword = request.getParameter("pword");
		/*
		try {
	         // Register JDBC driver
	         Class.forName("com.mysql.jdbc.Driver");

	         // Open a connection
	         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		}catch(SQLException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		if(uname.equals("ronsarahan") && pword.equals("1234")){
			response.sendRedirect("welcome.jsp");
		}
		else{
			response.sendRedirect("login.jsp");
		}
	}

}
