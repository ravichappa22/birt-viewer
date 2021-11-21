package com.init.mvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MenusAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("at menusaction redirecting to frameset");
        req.getSession().setAttribute("name", "Ravi");
        req.getSession().setAttribute("test", "testvalue");
        RequestDispatcher dispatcher =
                req.getRequestDispatcher("buildMenus.jsp");
        dispatcher.forward( req, resp );
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        this.doGet(req,resp);
    }
}
