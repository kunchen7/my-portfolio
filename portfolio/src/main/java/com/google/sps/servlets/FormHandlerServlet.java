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

    String name = request.getParameter("name-input");
    String email = request.getParameter("email-input");
    String message = request.getParameter("message-input");
    String wc = request.getParameter("wc-input");
    String other = request.getParameter("other-input");
    String language = request.getParameter("language");

    sendResponse(response, String.format("Name: %s", name));
    sendResponse(response, String.format("Email: %s", email));
    sendResponse(response, String.format("Language: %s", language));
    sendResponse(response, String.format("Message: %s", message));
    sendResponse(response, String.format("The reason for contacting: %s", wc));
    sendResponse(response, String.format("If choose Others, the reason is: %s", other));
  }


    private void sendResponse(HttpServletResponse response, String responseText) throws IOException {
        System.out.println(responseText);
        response.getWriter().println(responseText);
        response.sendRedirect("redirect.html");
    }
  }