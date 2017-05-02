package com.work.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Sky_el on 02.05.2017.
 */
public class SignOutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession se = req.getSession();
        se.removeAttribute("account_session");
        req.getRequestDispatcher("jsp/MainPage.jsp").forward(req, resp);
    }
}
