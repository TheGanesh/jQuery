package com.ganesh.github.jquery;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
public class SampleServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * Default constructor.
   */
  public SampleServlet() {
    // TODO Auto-generated constructor stub
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String value = request.getParameter("value");
    response.getWriter().write(new StringBuilder().append("You posted <strong>").append(value).append("</strong>.").toString());
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String value = request.getParameter("value");
    response.getWriter().write(new StringBuilder().append("You submitted <strong>").append(value).append("</strong>.").toString());
  }

}
