package com.work.servlets;

import com.work.model.Account;
import com.work.model.Company;
import com.work.model.Employee;
import com.work.service.impl.CompanyServiceImpl;
import com.work.service.impl.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Sky_el on 02.05.2017.
 */
public class PersonalAreaServlet extends HttpServlet {

    private final EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    private final CompanyServiceImpl companyService = new CompanyServiceImpl();
    private final MainPageServlet mainPageServlet = new MainPageServlet();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Employee employee;
        Company company;

        mainPageServlet.initLoginOfAuthorizedUser(req);
        HttpSession se = req.getSession();
        Account account = (Account) se.getAttribute("account_session");

        if((employee = employeeService.getEmployeeByID(account.getId())) != null) {
            req.setAttribute("employee", employee);
        }
        else if((company = companyService.getCompanyByID(account.getId())) != null) {
            req.setAttribute("company", company);
        }

        req.setAttribute("account", account);

        req.getRequestDispatcher("jsp/PersonalArea.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
