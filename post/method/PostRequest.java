package com.post.method;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login")
public class PostRequest extends HttpServlet{
  public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
  {
	  String name =  request.getParameter("name");
	  request.setAttribute("name", name);
	  request.getRequestDispatcher("/WEB-INF/views/post.jsp").forward(request, response);
  }
  
  public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
  {
	  String name =  request.getParameter("name");
	  String pass = request.getParameter("pass");
	  request.setAttribute("name", name);
	  request.setAttribute("pass",pass);
	  request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
  }
}
