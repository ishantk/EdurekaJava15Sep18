package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/LogonUserServlet", "/Login" })
public class LoginUserServlet extends HttpServlet {

	// doPost will be executed when client requests for LoginUserServlet with http method as post.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. Extract Data from Request
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		System.out.println("==User Details==");
		System.out.println(user);
		
		// 2. We are checking the data within object in the DB
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		boolean login = helper.loginUser(user);
		helper.closeConnection();
		
		
		// 3. Send back Response to the Client from Servlet
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body><center>");
		
		if(login){
			
			String name = "Mike";
			int age = 30;
			
			//1. Session Tracking - Cookies
			
			/*Cookie ck1 = new Cookie("keyName", name);
			Cookie ck2 = new Cookie("keyEmail", user.email);
			Cookie ck3 = new Cookie("keyAge", String.valueOf(age));
			
			response.addCookie(ck1);
			response.addCookie(ck2);
			response.addCookie(ck3);
			
			out.print("<h3>"+user.email+" Logged In Succesfully</h3>");
			out.print("<a href='Welcome'>Enter Home</a>");*/
			
			//2. Session Tracking - URL ReWriting
			//out.print("<h3>"+user.email+" Logged In Succesfully</h3>");
			//out.print("<a href='Welcome?name="+name+"&email="+user.email+"&age="+age+"'>Enter Home</a>");
			
			//3. Session Tracking - Hidden Form Fields
			/*out.print("<h3>"+user.email+" Logged In Succesfully</h3>");
			String form = "<form action='Home' method='post'>"
					+ "<input type='hidden' name='name' value='"+name+"'/>"
					+ "<input type='hidden' name='email' value='"+user.email+"'/>"
					+ "<input type='hidden' name='age' value='"+age+"'/>"
					+ "<input type='submit' value='Enter Home'/>"
					+ "</form>";
			out.print(form);*/
			
			//4. Session Tracking - HttpSession Object
			out.print("<h3>"+user.email+" Logged In Succesfully</h3>");
			out.print("<a href='Welcome'>Enter Home</a>");
			
			HttpSession session = request.getSession();
			session.setAttribute("keyName", name);
			session.setAttribute("keyEmail", user.email);
			session.setAttribute("keyAge", age); // we need not to convert age into String :)
			
		}else{
			out.print("<h3>"+user.email+" Not Logged In Succesfully</h3>");
		}
	
		out.print("</center></body></html>");		
	}

}
