package web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;


@WebServlet("/req1")
public class demo1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getMethod();
        System.out.println(method);

        String contextPath = req.getContextPath();
        System.out.println(contextPath);

        StringBuffer url = req.getRequestURL();
        System.out.println(url);

        String uri = req.getRequestURI();
        System.out.println(uri);

        String queryString = req.getQueryString();
        System.out.println(queryString);

        String header = req.getHeader("user-agent");
        System.out.println(header);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader reader = req.getReader();

        String s = reader.readLine();
        System.out.println(s);
    }
}
