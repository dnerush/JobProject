package com.work.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Sky_el on 14.03.2017.
 */
public class AboutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession se = req.getSession();
        if (se.getAttribute("http_session")!= null)
            req.getRequestDispatcher("jsp/About.jsp").forward(req, resp);
        else
            req.getRequestDispatcher("jsp/Authorization.jsp").forward(req, resp);
        se.removeAttribute("http_session");
    }
}
