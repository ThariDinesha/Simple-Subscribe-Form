/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/MyServlet"})
public class MyServlet extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        String[] Referredchannels = request.getParameterValues("Referredchannels");
        
        PrintWriter out = response.getWriter();
        out.println("User Name : "+name);
        out.println("Email: "+email);
        out.println("Country: "+country);
        out.println("Reffred Channels: ");
        for(String Ref : Referredchannels){
            out.println(" "+ Ref);
        }
    }
   
}
