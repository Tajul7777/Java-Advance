package com.servlet;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet implements Servlet{
    //Life cycle methods
    ServletConfig config;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config=config;
        System.out.println("Creating servleting Object...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servleting....");
        // Set the content type
        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();
        out.println("<h4>Servlet created using implements Servlet!!</h4>");
    }

    @Override
    public void destroy() {
        System.out.println("Going to destroy Servleting object... ");
    }

    public ServletConfig getServletConfig() {
        return this.config;
    }
    public String getServletInfo(){
        return "this servlet is creating by Md Tajul Islam Parvaz";
    }

}
