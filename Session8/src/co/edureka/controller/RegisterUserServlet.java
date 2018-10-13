package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/RegisterUserServlet", "/Register" })
public class RegisterUserServlet extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("==init executed==");
	}

	public void destroy() {
		System.out.println("==destroy executed==");
	}

	// service will be executed when client requests for RegisterUserServlet with any http method
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==service executed==");
		
		// 1. Extract Data from Request
		User user = new User();
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		System.out.println("==User Details==");
		System.out.println(user);
		
		// 2. Saving the temporary data of User object in Table i.e. in DB
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		int i = helper.registerUser(user);
		helper.closeConnection();
		
		
		// 3. Send back Response to the Client from Servlet
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body><center>");
		
		if(i>0){
			out.print("<h3>"+user.name+" Registered Succesfully</h3>");
		}else{
			out.print("<h3>"+user.name+" Not Registered Succesfully</h3>");
		}
	
		out.print("</center></body></html>");
	}

}
