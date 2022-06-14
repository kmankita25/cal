package com.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("Text/html");
        //extends Writer. Prints formatted representations of objects to a text-output stream.
        // This class implements all of the print methods found in PrintStream
        //Returns a PrintWriter object that can send character text to the client.
        PrintWriter out = response.getWriter();
        //Passing data from client to JSP it returns value as string
        String v = request.getParameter("hello");
        out.println("<h2> calculate :" +v + "<h2>");
    }
}