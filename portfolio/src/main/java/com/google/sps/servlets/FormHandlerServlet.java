package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String name = request.getParameter("name-input");
    String email = request.getParameter("email-input");
    String message = request.getParameter("message-input");
    String wc = request.getParameter("wc-input");
    String other = request.getParameter("other-input");
    String language = request.getParameter("language");

    // Print the value so you can see it in the server logs.
    System.out.println("Name: " + name + "</p>");
    System.out.println("Email: " + email + "</p>");
    System.out.println("Communication Language" + language + "</p");
    System.out.println("Message" + message + "</p>");
    System.out.print("The reason for contacting is " + wc + "</p>");
    System.out.print("If choose Others, the reason is " + other + "</p>");  


    // Write the value to the response so the user can see it.
    response.getWriter().println("You name is : " + name + "</p>");
    response.getWriter().println("You email: " + email + "</p>");
    response.getWriter().println("Communication Language: " + language + "</p>");
    response.getWriter().println("You message: " + message + "</p>");
    response.getWriter().println("The reason for contacting is " + wc + "</p>");
    response.getWriter().println("If choose Others,the reason is " + other + "</p>");   
    response.sendRedirect("redirect.html");
  }
}