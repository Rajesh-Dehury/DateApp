package com.nt.servlet;

import javax.servlet.*;
import java.io.*;
import java.util.*;

public class DateServlet extends GenericServlet{
    public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
        PrintWriter pw=res.getWriter();

        res.setContentType("text/html");

        Date d=new Date();

        // pw.println("<H1>HELLO</H1>");
        pw.println("<H1>Taday Date ::"+d.toString()+"</H1>");


        pw.println("<br>req obj : "+req.hashCode());
        pw.println("<br>res obj : "+res.hashCode());
        pw.println("<br> thread obj : "+Thread.currentThread().hashCode());
        pw.println("<br>Crnt cls obj : "+this.hashCode());

        pw.close();
    }
} 