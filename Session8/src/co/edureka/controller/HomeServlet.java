package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet({ "/HomeServlet", "/Home", "/Welcome" })
public class HomeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body><center>");
		
		String dateTime = new Date().toString();
		out.print("<h3>Welcome User</h3>");
		out.print("<h4>Its:"+dateTime+"</h4>");
		
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" : "+ck.getValue()+"<br/>");
		}*/
		
		/*String name = request.getParameter("name");
		String email = request.getParameter("email");
		String age = request.getParameter("age");*/
		
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("keyName");
		String email = (String)session.getAttribute("keyEmail");
		int age = (int)session.getAttribute("keyAge");
		
		
		out.print("Details:<br/>"+name+"<br/>"+email+"<br/>"+age);
		
		out.print("</center></body></html>");	
		
	}

}
