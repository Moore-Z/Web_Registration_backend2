package web.respond;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/resp1")
public class Responsedemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("resp1.....");
//        response.setStatus(302);
//        response.setHeader("location","/Request_Servlet_demo/resp2");
        String contextPath = request.getContextPath();
        response.sendRedirect(contextPath+"/resp2");
        //response.sendRedirect("http://www.google.com" );
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
