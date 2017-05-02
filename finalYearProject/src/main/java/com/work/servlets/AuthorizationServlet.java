package com.work.servlets;

import com.work.model.Account;
import com.work.service.impl.AccountServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by Sky_el on 22.03.2017.
 */
public class AuthorizationServlet extends HttpServlet {

    private final AccountServiceImpl accountService = new AccountServiceImpl();
    //private final EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    //private final CompanyServiceImpl companyService = new CompanyServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("jsp/Authorization.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        List<Account> accountList = accountService.accountList();
        Account foundAccount;
        // если аккаунт найден - добавляем его в сессию
        if((foundAccount = searchInAccountList(accountList, login, password)) != null) {
            HttpSession session = req.getSession();
            session.setAttribute("account_session", foundAccount);
            req.getRequestDispatcher("jsp/MainPage.jsp").forward(req, resp);
        }
        else
        {
            req.getRequestDispatcher("jsp/Authorization.jsp").forward(req, resp);
        }
    }

    /*
    * Поиск среди Accounts пользователя с указанным логином и паролем
    * */
    private Account searchInAccountList(List<Account> accountList, String login, String password) {
        for(Account account : accountList) {
            if(account.getLogin().equals(login) && account.getPassword().equals(password))
                return account;
        }
        return null;
    }
}
