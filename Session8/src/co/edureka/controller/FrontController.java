package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet({ "/FrontController", "/Front" })
public class FrontController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = request.getParameter("txtType");
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body><center>");
		out.print("<h3>Welcome to FrontController</h3>");
		out.print("</center></body></html>");		
		
		if(type.equals("register")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("Register");
			dispatcher.forward(request, response);
		}else if(type.equals("login")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login");
			//dispatcher.forward(request, response); // exclude response of FrontController 
			dispatcher.include(request, response);   // include response of FrontController as well
		}else{
			response.sendRedirect("https://www.google.co.in");
		}
		
	}

}
