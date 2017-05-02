package com.work.servlets;

import com.work.model.Account;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Sky_el on 14.03.2017.
 */
public class MainPageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        initLoginOfAuthorizedUser(req);
        req.getRequestDispatcher("jsp/MainPage.jsp").forward(req, resp);
    }

    public void initLoginOfAuthorizedUser(HttpServletRequest req) {
        HttpSession se = req.getSession();

        if(se.getAttribute("account_session") != null)
        {
            req.setAttribute("account_session", true);
            Account account = (Account) se.getAttribute("account_session");
            req.setAttribute("accountLogin", account.getLogin());
        }
    }
}
