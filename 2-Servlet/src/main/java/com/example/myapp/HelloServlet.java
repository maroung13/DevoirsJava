package com.example.myapp;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns={"/maservlet"})
public class HelloServlet extends HttpServlet {
    public void service( HttpServletRequest request,
                         HttpServletResponse response )
            throws ServletException, IOException {
        response.setContentType( "text/html" );
        PrintWriter out = response.getWriter();
        out.println( "<html><body>" );
        out.println( "<h1>Bonjour</h1>" );
        out.println( "</body></html>" );
    }
}